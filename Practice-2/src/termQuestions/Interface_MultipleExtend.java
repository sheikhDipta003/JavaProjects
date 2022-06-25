package termQuestions;

interface A{
    default void f(){
        System.out.println("A's f()");
    }
}

interface B{
    default void f(){
        System.out.println("B's f()");
    }
}

public class Interface_MultipleExtend implements A, B{
    @Override
    public void f() {
        System.out.println("Interface_MultipleExtend's f()");
    }
}
