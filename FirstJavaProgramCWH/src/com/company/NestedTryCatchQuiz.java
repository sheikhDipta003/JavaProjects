//This program will take array index from the user until the user gives index within range of myArray[]. In other
//words, it will keep prompting user for input until the input falls in [0, 2] range.
//Maximum 5 tries will be considered.
package com.company;

import java.util.Scanner;

class MaxRetryException extends Exception{
    @Override
    public String getMessage() {
        return "Maximum retry has been reached ...";
    }
}

public class NestedTryCatchQuiz {
    public static void main(String[] args) {
        int myArray[] = new int[3], ind, d, i = 0;
        myArray[0] = 10;
        myArray[1] = 26;
        myArray[2] = 35;
        boolean flag = true;

        while(i < 5 && flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter array index: ");
            ind = sc.nextInt();

            try {
                System.out.println("Outer try: ");
                System.out.println("index = " + ind);

                try {
                    System.out.println("Inner try: element no. " + ind + ": " + myArray[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Inner catch: Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Outer catch: Exception in level 1");
            }

            i++;

            System.out.println((5 - i) + " tries left ...");
        }
    }
}
