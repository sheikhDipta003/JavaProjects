package com.company;

/*class C1{
    public int x = 50;
    protected int y = 100;
    int z = 150;
    private int a = 200;

    public void meth1(){
        System.out.println("x = " + x); //we can use public properties within the same class
        System.out.println("y = " + y); //we can use protected properties within the same class
        System.out.println("z = " + z); //we can use default properties within the same class
        System.out.println("a = " + a); //we can use private properties within the same class
    }
}*/

public class UsingAccessMod {
    //Copying the contents of C1 class for demo purposes
    public int x = 50;
    protected int y = 100;
    int z = 150;
    private int a = 200;

    public void meth1(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        //C1 c = new C1();
        //c.meth1();
        System.out.println("Hello there!");
        /*System.out.println("x = " + c.x); //we can use public properties within the same package
        System.out.println("y = " + c.y); //we can use protected properties within the same package
        System.out.println("z = " + c.z); //we can use default properties within the same package
        //System.out.println("a = " + c.a); //we CANNOT use private properties within the same package*/
    }
}
