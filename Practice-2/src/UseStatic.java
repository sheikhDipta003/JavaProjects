public class UseStatic {
    static int a = 10;
    static int b;
    // static vars; initialization is performed as soon as the class is loaded
    // uninitialized vars contain zero by default

    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("Final value of b = " + b);
    }
    //  static method; executes only when called from another method

    static {
        System.out.println("Initial value of b = " + b);
        b = a * 4;
    }
    //  static block of code; executes as soon as the class is loaded
    //  Useful if I need to do computation in order to initialize static variables, I can
    //  declare a static block that gets executed exactly once, when the class is first
    //  loaded.

    public static void main(String[] args) {
        meth(25);
    }
}
