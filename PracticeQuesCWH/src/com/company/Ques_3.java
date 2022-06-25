package com.company;

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("inside jump() method");
    }

    void bite(){
        System.out.println("Inside bite() method");
    }
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Inside eat() method");
    }

    @Override
    public void sleep() {
        System.out.println("Inside sleep() method");
    }

    void speak(){
        System.out.println("Inside speak() method");
    }
}

public class Ques_3 {
    public static void main(String[] args) {
        Monkey m1 = new Human();
        //m1.speak();   --> error, since m1 is a REFERENCE to Monkey class which doesn't have a speak() method
        m1.bite();
        m1.jump();

        BasicAnimal b = new Human();
        //b.speak();    --> error, for the same reason as above
        b.eat();
        b.sleep();
    }
}
