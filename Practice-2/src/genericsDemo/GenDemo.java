package genericsDemo;

public class GenDemo {
    public static void main(String[] args) {
        System.out.println("-------------- Gen<Integer> -------------");
        Gen<Integer> iOb;   //creating a reference to Gen<Integer> class
        iOb = new Gen<>(100);   //assigning an Gen<Integer> object, autoboxing will take place here
        int i = iOb.getOb();    //auto-unboxing will occur
        System.out.println("Value of iOb: " + i);
        iOb.showType();

        System.out.println("\n-------------- Gen<String> -------------");
        Gen<String> sOb;
        sOb = new Gen<>("Lorem ipsum");
        String str = sOb.getOb();
        System.out.println("Value of sOb: " + str);
        sOb.showType();

        //iOb = sOb;  //compile error; thus generics converts all runtime errors into compile errors
    }
}
