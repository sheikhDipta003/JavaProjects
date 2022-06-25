package termQuestions;

interface i1{
    default void f1(){}
    void f2();
}

interface i2{
    void f3();
    void f4();
}

abstract class c1 implements i1{
    abstract void f5();
    final void f6(){}
}

public class Inherit_AbstractClass_Interface extends c1 implements i2{
    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }

    @Override
    public void f4() {

    }

    @Override
    void f5() {

    }
}
