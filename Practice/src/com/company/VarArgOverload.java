package com.company;

public class VarArgOverload {
    static void va_test3(int ... A){
        System.out.println("int ... A\n" + "Number of elements: " + A.length + ", contents: ");

        //display the contents using "for-each" loop
        for(int i: A) {
            System.out.println(i + " ");
        }
        System.out.println("\n");
    }

    static void va_test3(boolean ... A){
        System.out.println("boolean ... A\n" + "Number of elements: " + A.length + ", contents: ");

        //display the contents using "for-each" loop
        for(boolean i: A) {
            System.out.println(i + " ");
        }
        System.out.println("\n");
    }

    static void va_test3(String msg, int ... A) {
        System.out.println("String msg, int ... A\n" + msg + "Number of elements = " + A.length + ", contents:");

        //display the contents using "for-each" loop
        for(int i: A) {
            System.out.println(i + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        va_test3(20, 30, 40);
        va_test3(true, false, false, true);
        va_test3("Testing: ", 30, 40, 60, 70, 20);
        //va_test3();   --> this is ambiguous call, since the compiler wouldn't be able to decide if it is-
                        //va_test3(boolean ... A) with no arguments, or
                        //va_test3(int ... A) with no arguments; hence, if commented out, this program will not compile
    }
}
