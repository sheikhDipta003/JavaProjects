package com.company;

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("Inside ring() method");
    }

    void lift(){
        System.out.println("Inside lift() method");
    }

    void disconnect(){
        System.out.println("Inside disconnect() method");
    }

    void camera(){
        System.out.println("Inside camera() method");
    }
}

public class Ques_4 {
    public static void main(String[] args) {
        Telephone tp = new SmartTelephone();
        //since tp is a reference variable of class Telephone, it can only use those methods that are defined in Telephone class
        //that's why, the following statement is incorrect.
        //tp.camera();
        tp.disconnect();
        tp.ring();
        tp.lift();
    }
}
