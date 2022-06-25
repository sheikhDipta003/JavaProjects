package com.company;

public class VarArgs {
    static void va_test(int ... A){
        System.out.println("Number of elements: " + A.length + ", contents: ");

        //display the contents using "for-each" loop
        for(int i: A) {
            System.out.println(i + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        //pass variable-length arrays to va_test() method without creating the arrays themselves
        va_test(20, 30, 40);
        va_test(30, 50, 70, 28, 69, 20);
        va_test();
    }
}
