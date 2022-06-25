package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{ //an interface can extend (that is, inherit all the members of)
    void meth3();       //another interface; but a class CANNOT extend an interface
    void meth4();
}

//Since childSampleInterface inherits all the members of SampleInterface, all the abstract methods(meth1() and meth2())
//in SampleInterface must be defined in the class as well as all the abstract methods(meth3() and meth4())
//in childSampleInterface.
class SampleClass implements childSampleInterface{
    @Override
    public void meth1() {
        System.out.println("Inside meth1...");
    }

    @Override
    public void meth2() {
        System.out.println("Inside meth2...");
    }

    @Override
    public void meth3() {
        System.out.println("Inside meth3...");
    }

    @Override
    public void meth4() {
        System.out.println("Inside meth4...");
    }
}

public class Inheritance_In_Interfaces {
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();

        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
