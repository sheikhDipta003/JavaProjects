package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "Inside toString()";
    }

    @Override
    public String getMessage() {
        return "Inside getMessage()";
    }
}

class RectException extends Exception{
    @Override
    public String getMessage() {
        return "Dimensions of a 2D object cannot be negative or zero!";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        double width, height;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width of the rectangle: ");
        width = sc.nextDouble();

        System.out.println("Enter height of the rectangle: ");
        height = sc.nextDouble();

        /*a = sc.nextInt();

        if (a < 10){
            try{
                System.out.println("\nInside try block:");
                //throw new MyException();
                throw new ArithmeticException("This is an exception!");
            }
            catch (Exception e){
                System.out.println("\nInside catch block:");
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes! Finished");
        }*/

        if (width <= 0 || height <= 0){
            try{
                throw new RectException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println(width * height);
        }
    }
}
