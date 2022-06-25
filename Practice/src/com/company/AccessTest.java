package com.company;

class Test3 {
    int a;  //by default, this member has public access
    public int b;   //this member also has public access
    private int c;      //private access

    void setC(int i){
        c = i;      //sets the value of c
    }

    int getC(){
        return c;   //returns the value of c
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test3 ob = new Test3();

        //initialize a, b directly since they have public access
        ob.a = 10;
        ob.b = 20;

        //ob.c = 30; --> Error, since c has private access and cannot be modified out of its class directly

        ob.setC(30);    //this is OK

        System.out.println("a = " + ob.a + "; b = " + ob.b + "; c = " + ob.getC());
    }
}
