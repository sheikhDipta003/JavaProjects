class Box{
    double length, width, height;

    Box(){
        this.length = this.width = this.height = 1;
        System.out.println("Inside first constructor of Box class");
    }

    Box(double len){
        this.length = this.width = this.height = len;
        System.out.println("Inside second constructor of Box class");
    }

    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("Inside third constructor of Box class");
    }

    Box(Box box){
        this.length = box.length;
        this.width = box.width;
        this.height = box.height;
        System.out.println("Inside fourth constructor of Box class");
    }

    double volume(){
        return (this.length * this.width * this.height);
    }
}

class BoxWeight extends Box{
    double weight;

    BoxWeight(double l, double w, double h, double m){
        // super(l, w, h);
        // if this line is uncommented, third constructor is called
        // otherwise, the first constructor is called
        // this is an alternative way of doing the same thing as line no. 43 - 46
        // super() must be placed at the first sentence of a subclass, otherwise compile error will be reported

        length = l;
        width = w;
        height = h;
        this.weight = m;
        System.out.println("Inside constructor of BoxWeight class");
    }

    void showVal(){
        System.out.println("Dimensions of the box:");
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(3, 4, 5, 10);
        BoxWeight mybox2 = new BoxWeight(1, 2, 3, 5);

        System.out.println("Volume of box-1: " + mybox1.volume());
        System.out.println("Volume of box-2: " + mybox2.volume());

        Box mybox3 = new BoxWeight(5, 4, 6, 10);
        System.out.println("Volume of box-3: " + mybox3.volume());
        // System.out.println(mybox3.showVal());
        // showVal() cannot be accessed because this method is unknown to the superclass Box
    }
}
