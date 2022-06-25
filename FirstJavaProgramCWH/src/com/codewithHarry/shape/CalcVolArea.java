package com.codewithHarry.shape;

interface Shape{
    double area();
    double vol();
}

class Rectangle implements Shape{
    private double dim1;
    private double dim2;

    public void setDim1(double d1){
        dim1 = d1;
    }

    public void setDim2(double d2){
        dim2 = d2;
    }

    @Override
    public double area() {
        return dim1 * dim2;
    }

    @Override
    public double vol() {
        return 0;
    }
}

class Cylinder implements Shape{
    private double dim1;
    private double dim2;

    public void setDim1(double d1){
        dim1 = d1;
    }

    public void setDim2(double d2){
        dim2 = d2;
    }

    @Override
    public double area() {
        return 2 * 3.1416 * dim1 * dim2;
    }

    @Override
    public double vol() {
        return 3.1416 * dim1 * dim1 * dim2;
    }
}

class Square implements Shape{
    private double dim1;

    public void setDim1(double d1){
        dim1 = d1;
    }

    @Override
    public double area() {
        return dim1 * dim1;
    }

    @Override
    public double vol() {
        return 0;
    }
}

class Circle implements Shape{
    private double dim1;
    private double dim2;

    public void setDim1(double d1){
        dim1 = d1;
    }

    @Override
    public double area() {
        return 3.1416 * dim1 * dim1;
    }

    @Override
    public double vol() {
        return 0;
    }
}

class Sphere implements Shape{
    private double dim1;
    private double dim2;

    public void setDim1(double d1){
        dim1 = d1;
    }

    @Override
    public double area() {
        return 4 * 3.1416 * dim1 * dim1;
    }

    @Override
    public double vol() {
        return (4 * 3.1416 * dim1 * dim1 * dim1 / 3);
    }
}


public class CalcVolArea {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double width, height, side, radius;

        Rectangle rect = new Rectangle();
        Cylinder cyl = new Cylinder();
        Square sq = new Square();
        Circle c = new Circle();
        Sphere s = new Sphere();

        //rectangle
        System.out.println("Rectangle ... \nwidth and height : ");
        width = sc.nextDouble();
        height = sc.nextDouble();
        rect.setDim1(width);
        rect.setDim2(height);

        System.out.println("Area: " + rect.area());
        System.out.println("Volume: " + rect.vol());

        //cylinder
        System.out.println("\nCylinder ... \nradius and height : ");
        radius = sc.nextDouble();
        height = sc.nextDouble();
        cyl.setDim1(radius);
        cyl.setDim2(height);

        System.out.println("Area: " + cyl.area());
        System.out.println("Volume: " + cyl.vol());

        //square
        System.out.println("\nSquare ... \nside : ");
        side = sc.nextDouble();
        sq.setDim1(side);

        System.out.println("Area: " + sq.area());
        System.out.println("Volume: " + sq.vol());

        //circle
        System.out.println("\nCircle ... \nradius : ");
        radius = sc.nextDouble();
        c.setDim1(radius);

        System.out.println("Area: " + c.area());
        System.out.println("Volume: " + c.vol());

        //sphere
        System.out.println("\nSphere ... \nradius : ");
        radius = sc.nextDouble();
        s.setDim1(radius);

        System.out.println("Area: " + s.area());
        System.out.println("Volume: " + s.vol());
    }
}
