package com.company;

class Box7{
    double width;
    double height;
    double depth;

    // constructor
    Box7(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double volume(){
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 mybox1 = new Box7(10, 15, 20);
        Box7 mybox2 = new Box7(3, 6, 9);

        System.out.println("Volume of the first box : " + mybox1.volume());
        System.out.println("Volume of the second box : " + mybox2.volume());
    }
}
