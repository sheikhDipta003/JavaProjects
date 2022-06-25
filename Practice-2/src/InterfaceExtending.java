interface I1{
    int SOME_CONST = 12345;
    void meth1();
}

interface I2{
    int SOME_CONST = 12345;
    void meth1();
}

//Although one class cannot extend multiple classes, one interface can extend multiple interfaces.
interface I3 extends I1, I2{
    void meth1();
}

class implementing implements I3{

    @Override
    public void meth1() {
        System.out.println("meth1() running; value from I1 = " + I1.SOME_CONST + ", value from I2 = " + I2.SOME_CONST);
        //We can access the constants of an interface by using <interface-name>.<constant-name>
    }

//    @Override
//    public void meth2() {
//        System.out.println("meth2() running");
//    }
//
//    @Override
//    public void meth3() {
//        System.out.println("meth3() running");
//    }
}

public class InterfaceExtending {
    public static void main(String[] args) {
        implementing ob = new implementing();
        ob.meth1();
//        ob.meth2();
//        ob.meth3();
    }
}
