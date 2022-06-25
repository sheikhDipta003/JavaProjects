package com.company;

import java.util.concurrent.ExecutionException;

class MyException1 extends Exception{
    @Override
    public String getMessage() {
        return "Radius of a circle cannot be negative or zero!";
    }
}

public class Throw_Throws {
    public static double circleArea(double r) throws MyException1{
        if (r <= 0) {
            try{
                throw new MyException1();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return Math.PI * r * r;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        return a / b;
    }

    public static void main(String[] args) {
        try{
            double area = circleArea(0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            int c = divide(12, 0);
            System.out.println("c = " + c);
        }
        catch (Exception e){
            System.out.println("Arithmetic Error!! Cannot divide by zero ...");
        }
    }
}
