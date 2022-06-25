class Outer{
    private int a = 100;
    private double pi = 3.1416;

    public void meth1(){
        System.out.println("Inside Outer class");
        System.out.println("Before calling meth2(): a = " + a);

        Inner in = new Inner();
        in.meth2(); // outer class cannot directly access members of inner class

        System.out.println("After calling meth2(): a = " + a);
    }

    // Defining another class which is actually a member of this class
    public class Inner{
        private int a = 25; // This "a" is independent of the "a" belonging to the outer class

        public void meth2() {
            System.out.print("Inside Inner class: ");
            System.out.println("a = " + a);
            System.out.println("Value of pi = " + pi);  // Inner class can directly access members of Outer class
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.meth1();

//        Inner inner = new Inner();    // Error! Inner class is not independent of Outer class
    }
}
