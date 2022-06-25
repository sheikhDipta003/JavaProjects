package com.company;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int myArray[] = new int[3], ind, d;
        myArray[0] = 10;
        myArray[1] = 26;
        myArray[2] = 35;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index: ");
        ind = sc.nextInt();

        try{
            System.out.println("Welcome to nested try-catch");
            System.out.println(36 / 6);
            System.out.println("element = " + myArray[ind]);

            try{
                System.out.println("element no " + ind + ": " + myArray[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exception in level 2");
            }
        }
        catch (Exception e){
            System.out.println("Exception in level 1");
        }

        //But unlike if-else, java compiler will first ALWAYS try to execute the try-block. That means, it will go on
        //executing line by line of the statements INSIDE try-block UNTIL it finds an Exception. As soon as javac
        //finds exception, it will jump out of the try-block and enter the subsequent catch-block handling that particular
        //exception.
    }
}
