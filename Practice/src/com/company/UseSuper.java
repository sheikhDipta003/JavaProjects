package com.company;

class P{
    int i;
}

class Q extends P{
    int i;  //this "i" hides the instance var "i" of class P

    Q(int a, int b){
        super.i = a;    //this statement assigns "a" to the instance var(i) associated with the superclass "P"
        i = b;          //this statement assigns "b" to the instance var(i) associated with the subclass "Q"
    }

    void show_values(){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        Q subOb = new Q(10, 20);

        subOb.show_values();
    }
}
