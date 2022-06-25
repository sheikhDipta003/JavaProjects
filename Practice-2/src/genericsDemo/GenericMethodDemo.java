package genericsDemo;

//General syntax for a generic method:
//<type-param-list> ret-type meth-name (param-list){}

public class GenericMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for (V v : y) if (x == v) return true;
        return false;
    }
    //This class is not a generic class. As a result, the type parameters used in this method(T and V) are unknown to this class.
    //Hence, in order to use them, we must specify their identity before the return type of this method.
    //Here, we are telling the compiler that the first argument that this method will receive must be an instance of
    //such a class that implements Comparable<> interface, and the class of the second one must extend the class of
    //the first or it may be the same as the class of the first argument.

    public static void main(String[] args) {
        Integer[] IArr = {10, 20, 30};
        if(isIn(20, IArr)){     //GenericMethodDemo.<Integer, Integer>isIn(20, IArr); --> equivalent
            System.out.println("20 is within IArr array.");
        }
        if(!isIn(-20, IArr)){
            System.out.println("-20 is not within IArr array.");
        }

        String[] strArr = {"A", "B", "C"};
        if(isIn("A", strArr)){  //GenericMethodDemo.<String, String>isIn("A", strArr);  --> equivalent
            System.out.println("A is within strArr");
        }
        if(!isIn("D", strArr)){
            System.out.println("D is not within strArr");
        }
    }
}
