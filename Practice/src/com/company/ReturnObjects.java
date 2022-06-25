package com.company;

class Test2{
    //define instance variables
    int a;

    //constructor
    Test2(int i) {
        a = i;
    }

    //method that returns the object invoking it after incrementing the object's copy of "a" by 10
    Test2 incrByTen() {
        Test2 temp = new Test2(a + 10);
        return temp;
    }
}

public class ReturnObjects {
    public static void main(String[] args) {
        Test2 obj1 = new Test2(10);
        Test2 obj2;

        obj2 = obj1.incrByTen();

        System.out.println("Value of of obj1 : " + obj1.a);
        System.out.println("Value of of obj2 : " + obj2.a);
    }
}
