package genericsDemo;

class GenCons{
    private double val;

    public <T extends Number> GenCons(T arg){
        val = arg.doubleValue();
    }

    public void showVal(){
        System.out.println("val = " + val);
    }
}

public class GenericConstructor {
    public static void main(String[] args) {
        GenCons obj1 = new GenCons(100);
        GenCons obj2 = new GenCons(3.1416);
        System.out.println("---- obj1 ----");
        obj1.showVal();
        System.out.println("\n---- obj2 ----");
        obj2.showVal();
    }
}
