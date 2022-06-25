package genericsDemo;

class TwoD{
    private int x, y;

    public TwoD(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){return this.x;}
    public int getY(){return this.y;}
}

class ThreeD extends TwoD{
    private int x, y, z;

    public ThreeD(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public int getZ(){return this.z;}
}

class FourD extends ThreeD{
    private int x, y, z, t;

    public FourD(int x, int y, int z, int t){
        super(x, y, z);
        this.t = t;
    }

    public int getT(){return this.t;}
}

class Coords<T extends TwoD> {
    private T[] points;

    public Coords(T[] points){
        this.points = points;
    }

    public T[] getPoints(){return points;}

    public static void showXY(Coords<?> c){
        for(int i = 0 ; i < c.getPoints().length; i++){
            System.out.println("Point - " + (i+1) + ": (" + c.getPoints()[i].getX() + ", " + c.getPoints()[i].getY() + ")");
        }
    }

    public static void showXYZ(Coords<? extends ThreeD> c){
        for(int i = 0 ; i < c.getPoints().length; i++){
            System.out.println("Point - " + (i+1) + ": (" + c.getPoints()[i].getX() + ", " + c.getPoints()[i].getY() + ", " + c.getPoints()[i].getZ() + ")");
        }
    }

    public static void showXYZT(Coords<? extends FourD> c){
        for(int i = 0 ; i < c.getPoints().length; i++){
            System.out.println("Point - " + (i+1) + ": (" + c.getPoints()[i].getX() + ", " + c.getPoints()[i].getY() + ", " + c.getPoints()[i].getZ() + ", " + c.getPoints()[i].getT() + ")");
        }
    }
}

public class BoundedWildCard {
    public static void main(String[] args) {
        TwoD [] twoDPoints = {
                new TwoD(0, 0),
                new TwoD(3, 4),
                new TwoD(-5, 6)
        };
        Coords<TwoD> twoDCoords = new Coords<>(twoDPoints); //creating a Coords instance with type argument TwoD
        System.out.println("---------------------- TwoD points ----------------------");
        Coords.showXY(twoDCoords);  //displaying all the TwoD points

        ThreeD [] threeDPoints = {
                new ThreeD(0, 0, 5),
                new ThreeD(3, 4, -1),
                new ThreeD(-5, 6, 0)
        };
        Coords<ThreeD> threeDCoords = new Coords<>(threeDPoints);
        System.out.println("\n---------------------- ThreeD points ----------------------");
        Coords.showXY(threeDCoords);    //displaying x, y coordinates of all points of threeDCoords object
        Coords.showXYZ(threeDCoords);   //displaying x, y, z coordinates of all points of threeDCoords object

        FourD [] fourDPoints = {
                new FourD(0, 0, 5, -3),
                new FourD(3, 4, -1, 6),
                new FourD(-5, 6, 0, 0)
        };
        Coords<FourD> fourDCoords = new Coords<>(fourDPoints);
        System.out.println("\n---------------------- FourD points ----------------------");
        Coords.showXY(fourDCoords);     //displaying x, y coordinates of all points of fourDCoords object
        Coords.showXYZ(fourDCoords);    //displaying x, y, z coordinates of all points of fourDCoords object
        Coords.showXYZT(fourDCoords);   //displaying all coordinates of all points of fourDCoords object
    }
}
