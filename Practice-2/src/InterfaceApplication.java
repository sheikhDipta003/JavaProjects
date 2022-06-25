interface myInterface {
    void print(String msg);
}

class MyClass1 implements myInterface{
    @Override
    public void print(String msg) {
        System.out.println(msg + " : " + msg.length());
    }
}

class MyClass2 implements myInterface{
    @Override
    public void print(String msg) {
        System.out.println(msg.length() + " : " + msg);
    }
}

public class InterfaceApplication {
    public static void main(String[] args) {
        MyClass1 mc1 = new MyClass1();
        MyClass2 mc2 = new MyClass2();
        myInterface mi;

        mi = mc1;
        mi.print("Hello world");
        mi = mc2;
        mi.print("Hello world");
        //The respective versions of print() is called depending upon the type of object interface reference "mi" is
        //pointing to. This decision is made at runtime.
    }
}
