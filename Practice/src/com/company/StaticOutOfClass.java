package com.company;

class StaticDemo{
    static int a = 10;
    static int b = 20;

    static void callMe(){
        System.out.println("a = " + a);
    }
}

public class StaticOutOfClass {
    public static void main(String[] args) {
        //callMe() method accessed through the class name
        StaticDemo.callMe();

        System.out.println("b = " + StaticDemo.b);  //b instance variable accessed through the class name
    }
}
