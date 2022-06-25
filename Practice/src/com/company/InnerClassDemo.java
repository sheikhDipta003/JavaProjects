package com.company;

class Outer{
    int outer_x = 100;

    void foo(){
        Inner obj = new Inner();
        System.out.println("From outer class: outer_x = " + outer_x);
        obj.display();
    }

    class Inner {
        void display(){
            System.out.print("From Inner class: outer_x = " + outer_x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer X = new Outer();
        X.foo();
    }
}
