package com.company;

public class VarArgs2 {
    static void va_test2(String msg, int ... A) {
        System.out.println(msg + "Number of elements= " + A.length + ", contents are the followings:");

        //display the contents using "for-each" loop
        for(int i: A) {
            System.out.println(i + " ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        //pass variable-length arrays to va_test() method without creating the arrays themselves
        va_test2("Two Args --> ", 20, 30, 40);
        va_test2("Five Args --> ", 30, 50, 70, 28, 69, 20);
        va_test2("No Arg --> ");
    }
}
