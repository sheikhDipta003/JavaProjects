package com.company;

class BoxWeight extends Box9{
    double weight;

    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m * 9.81;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 15, 20, 14.67);
        BoxWeight mybox2 = new BoxWeight(3, 4, 5, 3.14);
        double vol;

        System.out.println("Volume of the first box: " + mybox1.volume());
        System.out.println("Weight of the first box: " + mybox1.weight);

        System.out.println("Volume of the second box: " + mybox2.volume());
        System.out.println("Weight of the second box: " + mybox2.weight);
    }
}
