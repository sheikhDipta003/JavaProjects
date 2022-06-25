package genericsDemo;

class Gen11<T>{
    T ob;
    Gen11(T ob){
        this.ob = ob;
    }
    public T getOb() {
        return ob;
    }
}

class Gen12<T> extends Gen11<T>{
    Gen12(T ob){
        super(ob);
    }
}

public class RuntimeCompWithGenHierarchy {
    public static void main(String[] args) {
        Gen11<Integer> iOb1 = new Gen11<>(100);
        Gen12<Integer> iOb2 = new Gen12<>(-89);
        Gen12<String> strOb2 = new Gen12<>("Runtime comparisons");

        if(iOb1 instanceof Gen11<?>){
            System.out.println("iOb1 is an instance of Gen11");
        }
        if(!(iOb1 instanceof Gen12<?>)){
            System.out.println("iOb1 is not an instance of Gen12");
        }
        //iOb1 is a superclass object and Gen12<> is a subclass
        //we know, superclass object cannot be cast into a subclass object
        //therefore, "iOb1 instanceof Gen12<?>" - this condition is always false

        if(iOb2 instanceof Gen11<?>){
            System.out.println("iOb2 is an instance of Gen11");
        }
        //a subclass object can be cast into an instance of superclass, so this condition is always true

        if(iOb2 instanceof Gen12<?>){
            System.out.println("iOb2 is an instance of Gen12");
        }

        if(strOb2 instanceof Gen11<?>){
            System.out.println("strOb2 is an instance of Gen11");
        }
        if(strOb2 instanceof Gen12<?>){
            System.out.println("strOb2 is an instance of Gen12");
        }

        /*if(iOb1 instanceof Gen11<Integer>){
            System.out.println("iOb1 is an instance of Gen11<Integer>");
        }*/
        //compile time error
        //erasure
    }
}
