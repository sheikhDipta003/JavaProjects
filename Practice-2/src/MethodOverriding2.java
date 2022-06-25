class A{
    void callMe(){
        System.out.println("Inside A's callMe method");
    }
}

class B extends A{
    @Override
    void callMe(){
        System.out.println("Inside B's callMe method");
    }
}

class C extends A{
    void callMe(){
        System.out.println("Inside C's callMe method");
    }
}

public class MethodOverriding2 {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        C ob3 = new C();

        A x;
        x = ob1;
        x.callMe(); // calls the callMe() method of class A
        x = ob2;
        x.callMe(); // calls the callMe() method of class B
        x = ob3;
        x.callMe(); // calls the callMe() method of class C
    }
}
