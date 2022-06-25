package com.company;

class BoxF{
    //define instance variables
    private double width;
    private double height;
    private double depth;

    //constructor to initialize an object with values obtained from another existing object
    BoxF(BoxF obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    //create a constructor for uninitialized object
    BoxF(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //constructor for cube-shaped object
    BoxF(double side){
        width = side;
        height = side;
        depth = side;
    }

    //constructor for general parallelepiped
    BoxF(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

class BoxWeightF extends BoxF{
    double weight;

    //constructor of BoxWeightF to clone an object of this class
    BoxWeightF(BoxWeightF ob){
        super(ob);
        weight = ob.weight;
    }

    //constructor of BoxWeightF for uninitialized object
    BoxWeightF(){
        super();
        weight = -1;
    }

    //constructor of BoxWeightF for cube-shaped object
    BoxWeightF(double side, double m){
        super(side);
        weight = m;
    }

    //constructor of BoxWeightF for general parallelepiped
    BoxWeightF(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeightF my_box_1 = new BoxWeightF(10, 20, 30, 40.5);
        BoxWeightF my_box_2 = new BoxWeightF(5, 25.8);
        BoxWeightF my_box_3 = new BoxWeightF();
        BoxWeightF my_box_clone = new BoxWeightF(my_box_1);

        System.out.println("Volume of first box: " + my_box_1.volume());
        System.out.println("Weight of first box: " + my_box_1.weight);

        System.out.println("\nVolume of second box: " + my_box_2.volume());
        System.out.println("Weight of second box: " + my_box_2.weight);

        System.out.println("\nVolume of third box: " + my_box_3.volume());
        System.out.println("Weight of third box: " + my_box_3.weight);

        System.out.println("\nVolume of clone box: " + my_box_clone.volume());
        System.out.println("Weight of clone box: " + my_box_clone.weight);
    }
}
