
class Figure{
    double d1, d2;

    Figure(double d1, double d2){
        this.d1 = d1;
        this.d2 = d2;
    }

    public double area() {
        System.out.println("Area is undefined for a figure");
        return 0;
    }
}

class triangle extends Figure{
    triangle(int base, int height){
        super(base, height);
    }

    @Override
    public double area(){
        return (0.5 * d1 * d2);
    }
}

class rectangle extends Figure{
    rectangle(double width, double height){
        super(width, height);
    }

    @Override
    public double area(){
        return (d1 * d2);
    }
}

public class MethodOverriding3 {
    public static void main(String[] args) {
        rectangle r = new rectangle(10, 20);
        triangle t = new triangle(5, 10);

        Figure ref;
        ref = r;
        System.out.println("Area of the rectangle = " + ref.area());
        ref = t;
        System.out.println("Area of the triangle = " + ref.area());
    }
}

