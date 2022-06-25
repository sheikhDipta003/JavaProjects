package com.company;

class Figure{
    double dim1;
    double dim2;

    Figure(double d1, double d2){
        dim1 = d1;
        dim2 = d2;
    }

    double area(){
        System.out.println("\nArea of figure is undefined: ");
        return 0;
    }
}

class Rect extends Figure{
    Rect(int width, int height){
        super(width, height);
    }

    double area(){
        System.out.println("\nArea of the rectangle: ");
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(int base, int height){
        super(base, height);
    }

    double area(){
        System.out.println("\nArea of the triangle: ");
        return dim1 * dim2 * 0.5;
    }
}

public class FindAreas {
    public static void main(String[] args) {
        Figure f1 = new Figure(10, 20); //create an object of superclass Figure
        Rect f2 = new Rect(15, 12); //create an object of subclass Rect
        Triangle f3 = new Triangle(20, 30); //create an object of subclass Triangle
        Figure ref;     //create a reference variable of the superclass Figure

        ref = f1;
        System.out.print(ref.area());

        ref = f2;
        System.out.println(ref.area());

        ref = f3;
        System.out.println(ref.area());
    }
}
