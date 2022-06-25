package genericsDemo;

class NonGen{
    Object ob;
    NonGen(Object ob){this.ob=ob;}
    Object getOb(){return this.ob;}
    void showType(){
        System.out.println("class of the type parameter: " + ob.getClass().getSimpleName());
    }
}

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;     //creating a reference of NonGen class
        iOb = new NonGen(10);   //assigning an object of NonGen class holding an Integer
        System.out.println("--------------- iOb -----------------");
        int i = (Integer) iOb.getOb();  //manual type-casting is necessary, otherwise compile-time error occurs
        System.out.println("value: " + i);
        iOb.showType();

        NonGen sOb;     //creating a reference of NonGen class
        sOb = new NonGen("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo");   //assigning an object of NonGen class holding an Integer
        System.out.println("\n--------------- sOb -----------------");
        String str = (String)sOb.getOb();   //manual type-casting is necessary, otherwise compile-time error occurs
        System.out.println("value: " + str);
        sOb.showType();

        System.out.println("\n--------------- iOb (after assignment) -----------------");
        iOb = sOb;  //a NonGen object with Integer type argument may be assigned another NonGen object with String type argument
                    //as a result, there is no type safety
        i = (Integer) iOb.getOb();      //runtime error occurs (ClassCastException), not compile time error
                                        //because String object cannot be cast into Integer object
        System.out.println("value: " + i);
        iOb.showType();
    }
}
