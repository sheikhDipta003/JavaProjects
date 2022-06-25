package com.company;

class Test{
    //define instance variables
    int a, b;

    //constructor
    Test(int i, int j) {
        a = i;
        b = j;
    }

    //method to see if two objects are the same
    boolean equalTo(Test obj) {         //name of the Test class has been used as parameter type
        if (obj.a == a && obj.b == b) {
            return true;
        }
        else
            return false;
    }
}

public class PassObjects {
    public static void main(String[] args) {
        //create objects of Test class
        Test ob1 = new Test(100, 200);
        Test ob2 = new Test(100, 200);
        Test ob3 = new Test(-1, -3);

        //is ob1 == ob2?; ob2 == ob3?; ob3 == ob1?
        System.out.println("ob1 == ob2 : " + ob1.equalTo(ob2));
        System.out.println("ob2 == ob3 : " + ob2.equalTo(ob3));
        System.out.println("ob3 == ob1 : " + ob3.equalTo(ob1));
    }
}
