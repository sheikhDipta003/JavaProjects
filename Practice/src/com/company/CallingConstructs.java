package com.company;

//This program shows that the order of execution of the constructors of a class hierarchy is from the first superclass
//to all other subclasses sequentially

class X{
    X(){
        System.out.println("Inside X's constructor");
    }
}

class Y extends X{
    Y(){
        System.out.println("Inside Y's constructor");
    }
}

class Z extends Y{
    Z(){
        System.out.println("Inside Z's constructor");
    }
}

public class CallingConstructs {
    public static void main(String[] args) {
        Z ob = new Z();
    }
}
