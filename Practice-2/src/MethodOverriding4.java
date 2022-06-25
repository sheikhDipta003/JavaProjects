class Base{
    int a;
    Base(int a){this.a = a;}
    void show(){
        System.out.println("a = " + a);
    }
}

class Child extends Base {
    int b;
    Child(int a, int b){
        super(a);
        this.b = b;
    }
    @Override
    void show(){
        System.out.println("a = " + a + ", b = " + b);
    }
}

public class MethodOverriding4 {
    public static void main(String[] args) {
        Child c = new Child(10, 20);
        c.show();   //calls the overridden version
        Base b = c;
        b.show();   //calls the overridden version
        Base b2 = new Base(50);
        b2.show();  //calls the version of Base class
    }
}
