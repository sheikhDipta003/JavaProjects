package com.company;

class Box8 {
    //define instance variables
    double width;
    double height;
    double depth;

    //create a constructor for uninitialized object
    Box8(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //constructor for cube-shaped object
    Box8(double side){
        width = side;
        height = side;
        depth = side;
    }

    //constructor for general parallelepiped
    Box8(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        Box8 mybox1 = new Box8();
        Box8 mybox2 = new Box8(10);
        Box8 mybox3 = new Box8(3, 4, 5);

        //volume of the uninitialized box object
        System.out.println("volume of the uninitialized box object : " + mybox1.volume());
        //volume of the cubical box object
        System.out.println("volume of the cubical box object : " + mybox2.volume());
        //volume of the non-cubic box object
        System.out.println("volume of the non-cubic box object : " + mybox3.volume());
    }
}
