package DemoPack;

import com.company.UsingAccessMod;

class C2 extends UsingAccessMod{
    void meth2(){
        System.out.println("From C2: x = " + x);    //we can use public properties of a class in its subclass
        System.out.println("From C2: y = " + y);    //we can use protected properties of a class in its subclass
        //System.out.println("From C2: z = " + z);    //we CANNOT use default properties of a class in its subclass
        //System.out.println("From C2: a = " + a);    //we CANNOT use private properties of a class in its subclass
    }
}

public class MyClass {
    public static void main(String[] args) {
        C2 obj = new C2();
        obj.meth2();

        System.out.println("\nInside MyClass class of DemoPack package");
        System.out.println("From main: x = " + obj.x); //we can use public properties within the same world
        //System.out.println("y = " + obj.y); //we CANNOT use protected properties within the same world
        //System.out.println("z = " + obj.z); //we CANNOT use default properties within the same world
        //System.out.println("a = " + obj.a); //we CANNOT use private properties within the same world
    }
}
