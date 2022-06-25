package com.company;

class FountainPen extends Pen{
    //overriding the two abstract methods in Pen() class
    void write(){
        System.out.println("Inside write() method");
    }

    void refill(){
        System.out.println("Inside refill() method");
    }

    //inserting one additional concrete method
    void ChangeNib(){
        System.out.println("Inside ChangeNib()");
    }
}

public class Ques_2 {
    public static void main(String[] args) {
        //nothing
    }
}
