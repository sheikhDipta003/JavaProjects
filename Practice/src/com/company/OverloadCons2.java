package com.company;

class Box9 {
    //define instance variables
    double width;
    double height;
    double depth;

    //constructor to initialize an object with values obtained from another existing object
    Box9(Box9 obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    //create a constructor for uninitialized object
    Box9(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //constructor for cube-shaped object
    Box9(double side){
        width = side;
        height = side;
        depth = side;
    }

    //constructor for general parallelepiped
    Box9(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        Box9 mybox1 = new Box9();
        Box9 mybox2 = new Box9(10);
        Box9 mybox3 = new Box9(3, 4, 5);

        //initialize another Box9 object's dimensions corresponding to mybox2's dimensions
        Box9 myboxclone = new Box9(mybox2);

        //print te corresponding volumes
        System.out.println("Volume of mybox1 : " + mybox1.volume());
        System.out.println("Volume of mybox2 : " + mybox2.volume());
        System.out.println("Volume of mybox3 : " + mybox3.volume());
        System.out.println("Volume of myboxclone : " + myboxclone.volume());
    }
}
