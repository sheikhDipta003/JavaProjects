package com.company;

class A2{
    void callMe(){
        System.out.println("Inside A2's callMe() method");
    }
}

class B2 extends A2{
    void callMe(){
        System.out.println("Inside B2's callMe() method");
    }
}

class C3 extends B2{
    void callMe(){
        System.out.println("Inside C3's callMe() method");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A2 ob1 = new A2();  //object of class A2
        B2 ob2 = new B2();  //object of class B2
        C3 ob3 = new C3();  //object of class C3
        A2 ref;             //reference variable of class A2

        ref = ob1;      // "ref" refers to an object of A2 class
        ref.callMe();   //executes A2's version of callMe()

        ref = ob2;      // "ref" refers to an object of B2 class
        ref.callMe();   //executes B2's version of callMe()

        ref = ob3;      // "ref" refers to an object of C3 class
        ref.callMe();   //executes C3's version of callMe()
    }
}
