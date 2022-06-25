package com.company;

//any class containing at least one abstract method is abstract itself
abstract class Figure1{
    double dim1;
    double dim2;

    Figure1(double d1, double d2){
        dim1 = d1;
        dim2 = d2;
    }

    abstract double area(); //this creates a standard for determining area of a subclass describing a 2D object
    //derived from the superclass Figure1. It does not define any specific implementation for area() method, so that
    // all the subclasses derived from Figure1 can implement their own calculation of area by overriding this
    // area() method.
}

//All derived classes of an abstract class MUST EITHER -
//(1) override ALL THE ABSTRACT METHODS defined in the superclass(in this case, area()), OR-
//(2) be declared as an abstract class itself.
class Rect1 extends Figure1{
    Rect1(int width, int height){
        super(width, height);
    }

    double area(){
        System.out.println("\nArea of the rectangle: ");
        return dim1 * dim2;
    }
}

class Triangle1 extends Figure1{
    Triangle1(int base, int height){
        super(base, height);
    }

    double area(){
        System.out.println("\nArea of the triangle: ");
        return dim1 * dim2 * 0.5;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
        Rect1 f2 = new Rect1(15, 12); //create an object of subclass Rect
        Triangle1 f3 = new Triangle1(20, 30); //create an object of subclass Triangle
        Figure1 ref;     //Although we can't create/instantiate an object of an abstract class, we can CERTAINLY
                        //define a reference variable of that class. This variable can refer to any object of any
                        //class derived from the abstract class.
        ref = f2;
        System.out.println(ref.area());

        ref = f3;
        System.out.println(ref.area());
    }
}
