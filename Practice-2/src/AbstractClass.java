abstract class Figure1{
    double d1, d2;

    Figure1(double d1, double d2){
        this.d1 = d1;
        this.d2 = d2;
    }

    abstract double area();

    void show(){
        System.out.println("dim1 = " + d1);
        System.out.println("dim2 = " + d2);
    }
}

abstract class Figure2 extends Figure1{
    double d3;
    Figure2(double d1, double d2, double d3) {
        super(d1, d2);
        this.d3 = d3;
    }
    abstract double volume();

    void show(){
        System.out.println("dim1 = " + d1);
        System.out.println("dim2 = " + d2);
        System.out.println("dim3 = " + d3);
    }
}

class triangle1 extends Figure1{
    triangle1(int base, int height){
        super(base, height);
    }

    @Override
    public double area(){
        return (0.5 * d1 * d2);
    }
}

class rectangle1 extends Figure1{
    rectangle1(double width, double height){
        super(width, height);
    }

    @Override
    public double area(){
        return (d1 * d2);
    }
}

class sphere extends Figure2{
    sphere(double radius) {
        super(radius, radius, radius);
    }

    @Override
    double area() {
        return (4 * 3.1416 * d1 * d1);
    }

    @Override
    double volume() {
        return (4 * 3.1416 * d1 * d1 * d1 / 3);
    }
}

class parallelepiped extends Figure2{
    parallelepiped(double length, double width, double height){
        super(length, width, height);
    }
    @Override
    double area() {
        return (6 * (d1 * d2 + d2 * d3 + d1 * d3));
    }

    @Override
    double volume() {
        return (d1 * d2 * d3);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        rectangle1 r = new rectangle1(10, 20);
        triangle1 t = new triangle1(5, 10);

        Figure1 ref;    // we can create reference of an abstract class, though we can't instantiate that abstract class
        ref = r;
        System.out.println("Area of the rectangle = " + ref.area());
        ref = t;
        System.out.println("Area of the triangle = " + ref.area());

        // Anonymous class
        Figure1 f = new Figure1(20, 30) {
            @Override
            double area() {
                System.out.println("Anonymous class");
                return 0;
            }
        };

        f.area();
        f.show();

        sphere s1 = new sphere(10);
        parallelepiped p1 = new parallelepiped(3, 4, 5);
        Figure2 ref2;
        ref2 = s1;
        System.out.println("Area of the sphere = " + ref2.area() + ", volume = " + ref2.volume());
        ref2 = p1;
        System.out.println("Area of the parallelepiped = " + ref2.area() + ", volume = " + ref2.volume());
    }
}
