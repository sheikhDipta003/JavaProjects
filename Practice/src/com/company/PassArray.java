package com.company;

public class PassArray {
    //this method is an alternative of variable-length arguments, but with some limitations
    static void printArr(int A[]){
        System.out.println("Number of elements: " + A.length + ", contents: ");

        //display the contents using "for-each" loop
        for(int i: A){
            System.out.println(i + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        //create arrays of variable length
        int A1[] = {20, 30, 40};
        int A2[] = {30, 50, 70, 28, 69, 20};
        int A3[] = { };

        //pass all arrays to printArr() method
        printArr(A1);
        printArr(A2);
        printArr(A3);
    }
}
