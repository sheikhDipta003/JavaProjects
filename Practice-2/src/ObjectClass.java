import java.util.Objects;

class Point{
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    //checks equality of contents
    @Override
    public boolean equals(Object ob){
        //if the reference of the received object and the calling object of Point class are the same, return true
        if(ob == this){
            return true;
        }

        //if the received object does not instantiate Point class, return false
        //because a superclass object can refer to a subclass object, the superclass object can also be said to instantiate the subclass object
        //in this case, ob is referring to whatever object of any class is passed while calling this function
        if(!(ob instanceof Point)){
            return false;
        }

        Point p = (Point) ob;   //the compiler is showing error if I don't cast "ob" to "Point"
        //because I cannot assign reference of a superclass to a subclass

        //if both x coordinates and y coordinates are the same, then return true
        if(x == p.x && y == p.y){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(x, y);
    }
    //even if I don't override hashCode() method, there is no change in the output
    //that means, for overriding equals() method, it is not necessary to override hashCode() as well!
}

public class ObjectClass {

    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println(p1); //calls the toString() method automatically
        //when toString() is commented, something like Point@1d251891 is printed.
        //<class of the object>@<ID of that object assigned by javac>
        //by overriding this method, we can provide any implementation we want

        Point p2 = new Point(10, 20);
        Point p3 = p2;

        //checks equality of reference
        System.out.println(p1 == p2);   //false, different memory locations created due to "new"
        System.out.println(p2 == p3);   //true

        //checks for the contents, not the references
        System.out.println(p1.equals(p2));  //true
        System.out.println(p2.equals(p3));  //true

    }
}
