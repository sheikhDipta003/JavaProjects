package com.company;

class A{
    int i, j;

    void showij(){
        System.out.println("i = " + i + "; j = " + j);
    }
}

class B extends A {
    int k;

    void showk(){
        System.out.println("k = " + k);
    }

    void sum(){
        System.out.println("\nSum : i + j + k = " + (i + j + k));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        //initialize the copy of instance variables of superOb
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("values of i and j using superOb:");
        superOb.showij();

        //initialize i, j, k from subOb
        subOb.i = 8;    //subclass has access to all public members of its superclass (i, j and showij() in this case)
        subOb.j = 24;
        subOb.k = 13;
        System.out.println("\nvalues of i, j, k using subOb:");
        subOb.showij();
        subOb.showk();

        //sum of i, j, k from subOb
        subOb.sum();
    }
}
