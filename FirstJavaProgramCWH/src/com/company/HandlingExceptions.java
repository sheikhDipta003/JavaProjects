package com.company;

import java.util.Scanner;

public class HandlingExceptions {
    public static void main(String[] args) {
        int myArray[] = new int[3], ind, d;
        myArray[0] = 10;
        myArray[1] = 26;
        myArray[2] = 35;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index: ");
        ind = sc.nextInt();

        System.out.println("Enter the divisor: ");
        d = sc.nextInt();

        try{
            System.out.println("The element at the index " + ind + " is : " + myArray[ind]);
            System.out.println("The quotient is  " + myArray[ind] / d);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds!");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception!");
        }
        catch (Exception e){
            System.out.println("Some other exception!");
            System.out.println(e);
        }

        //Just like if-else statements, at a time, only one of the statements will be executed. If the index is
        //within the length of the array AND the divisor is not zero, then the try part will be executed; otherwise,
        //ONLY ONE of the following catch statements will be executed depending upon the type of exception. However,
        //if only the last catch statement is present with the try block, our program will handle all types of
        //exception; which means- this last catch block is equivalent of all 3 catch blocks combined.
    }
}
