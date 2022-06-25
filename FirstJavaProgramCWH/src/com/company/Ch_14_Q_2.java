package com.company;

import java.util.Scanner;

public class Ch_14_Q_2 {
    public static int divide(int a, int b, int c) throws IllegalArgumentException{
        if (b == 0){
            throw new IllegalArgumentException();
        }
        return ((a + b) / c);
    }

    public static void main(String[] args) {
        int num1, num2, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        num2 = sc.nextInt();

        System.out.println("Enter divisor: ");
        d = sc.nextInt();

        try{
            System.out.println(divide(num1, num2, d));
        }
        catch (ArithmeticException e){
            System.out.println("HaHa ...");
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe ...");
        }
    }
}
