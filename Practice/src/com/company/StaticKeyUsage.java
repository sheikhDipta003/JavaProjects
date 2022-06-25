package com.company;

import javax.sql.XAConnectionBuilder;

public class StaticKeyUsage {
    static int a = 3;   //these two statements only execute once when this class is loaded even before main()
    static int b;

    static void randMeth(int X){    //executed only after call from main() and WITHOUT REFERENCE TO ANY OBJECT
        System.out.println("X = " + X);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {        //static block; executes ONLY ONCE when this class is loaded even before main()
        b = 4 * a;
        System.out.println("The value of b has been set here!");
    }

    public static void main(String[] args) {
        randMeth(32);
    }
}
