package com.company;

class OverloadDemo{
    void test() {
        System.out.println("No parameters");
    }

    //overload the first test() with this one having one parameter
    void test(int a) {
        System.out.println("One int parameter: a = " + a);
    }

    //overload the first and second test() with this one having two parameters
    void test(int a, int b) {
        System.out.println("Two int parameters: a = " + a + " and b = " + b);
    }

    //overload the first, second and third test() with this one having one double parameter and a double return type
    double test(double a){
        System.out.println("One double parameter: a = " + a);
        return a * a;
    }
}

public class Overload {
    public static void main(String[] args) {
        //create an object of OverloadDemo class
        OverloadDemo x = new OverloadDemo();
        double result;

        //call all the four methods
        x.test();
        x.test(10);
        x.test(10, 20);
        result = x.test(3.1416);

        System.out.println("Return value of the last method: " + result);
    }
}
