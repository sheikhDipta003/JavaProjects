package termQuestions;

interface I1{
    default void f(){
        System.out.println("I1's f()");
    }
}

interface I2 extends I1{
    default void f(){
        System.out.println("I2's f()");
    }
}

public class MultipleInheritanceOfInterface implements I1, I2{

    public static void main(String[] args) {
        new MultipleInheritanceOfInterface().f();
    }

    /*@Override
    public void f() {
        System.out.println("public class's f()");
        //I1.super.f();
        //I2.super.f();
        //when there is no inheritance relationship between I1 and I2, this format may be used to call their respective
        //versions of f().
    }*/
    //If I1 and I2 does not have inheritance relation, then a class implementing both of them MUST override the default method
    //of the same signature. However, if I1 extends I2 or vice versa, then there is no need for overriding.
}
