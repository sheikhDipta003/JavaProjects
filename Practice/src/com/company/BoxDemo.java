package com.company;

class Box{
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        //assign the instance vars connected with mybox object the following values
        mybox1.setDim(10, 15, 20);
        mybox2.setDim(3, 4, 5);

        //display vol
        System.out.println("The volume of the first box is : " + mybox1.volume());
        System.out.println("The volume of the second box is : " + mybox2.volume());
    }
}
