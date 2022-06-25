class Outer2{
    int outer_x = 100;
    static String s = "Hello world";

    void test(){
        Inner3 inner3 = new Inner3();
        inner3.display();
    }

    // non-static nested class or, inner class
    class Inner2{
        int inner_x = -100;
        int outer_x = -200;
        // static String s2 = "Good morning";   // static members are not allowed in an inner class, why?
        // Because an inner class can never be instantiated without instantiating the outer class; i.e. all the
        // members of inner class can come into existence only if an object of the outer class already exists.
        // But by definition, static members are initialized as soon as a class is loaded, they must not wait for
        // instantiation of any class. Since the requirements of inner class and static member are contradictory,
        // inner classes do not support static members.

        void display(){
            System.out.println("inner_x = " + inner_x);
            System.out.println(outer_x);    // refers to the outer_x in this class
            System.out.println(Outer2.this.outer_x);    // refers to the outer_x in Outer2 class
        }
    }

    // static nested class
    static class Inner3{
        int inner_y = 50;

        void display(){
            System.out.println("inner_y = " + inner_y);
            // System.out.println("outer_x = " + outer_x);  // static method can only directly access static data
            System.out.println(s);
        }
    }
}

public class NestedClass2 {

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.test();

        // we can create an object of Inner2 class from main method as well
        // it has a weird structure!
        // This code is valid only in case of is non-static nested class/inner class
        Outer2.Inner2 obj = outer2.new Inner2();
        obj.display();
//        Outer2.Inner3 obj = outer2.new Inner3();  // error, Inner3 is static

        //We can create object of a static nested class
        Outer2.Inner3 ob2 = new Outer2.Inner3();
        ob2.display();
    }
}
