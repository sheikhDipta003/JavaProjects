package genericsDemo;

class Gen<T>{
    T ob;

    Gen(T ob){
        this.ob = ob;
    }

    T getOb(){return this.ob;}

    public void showType(){
        System.out.println("Type of T: " + ob.getClass().getSimpleName());
    }
}

public class RawTypeGenerics {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(100);
        Gen<String> strOb = new Gen<>("Disgusting world!!!");
        Gen raw = new Gen(98.6);    //raw use of a generic class
        //this creates a Gen object whose type T is replaced by Object

        double d = (double) raw.getOb();    //return type is not known, therefore, type casting is necessary
        System.out.println("Gen<raw>: d = " + d);

        int i = (Integer) raw.getOb();      //return type is not known, therefore, type casting is necessary; runtime error
        System.out.println("Gen<raw>: i = " + i);

        strOb = raw;    //this assignment overrides type-safety
        String str = strOb.getOb(); //since strOb is of type Gen<String>, casting is not needed here
        //however, since type argument of strOb is String, it is assumed that it will hold a String
        //but after the assignment, strOb will hold a double value, which cannot be detected at compile time because the type argument of 'raw' is unknown
        //thus, as soon as effort is made to assign contents of strOb to str, runtime error occurs

        System.out.println("Gen<String>: str = " + str);

        raw = iOb;      //this assignment also overrides type-safety
        //raw now refers to an object that contains an Integer object, but the cast assumes that it
        //contains a Double. This error cannot be prevented at compile time. Rather, it causes a runtime error.

        d = (double) raw.getOb();      //runtime error
        System.out.println("Gen<raw>: d = " + d);
    }
}
