package genericsDemo;

class Gen1<T>{
    T ob;
    Gen1(T ob){
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

class Gen2<T, V> extends Gen1<T>{
    V ob2;
    Gen2(T ob1, V ob2){
        super(ob1);
        this.ob2 = ob2;
    }

    public V getOb2() {
        return ob2;
    }
}

public class GenericsHierarchy {
    public static void main(String[] args) {
        Gen2<String, Integer> gen2 = new Gen2<>("Value is:", 100);
        System.out.println(gen2.getOb() + " " + gen2.getOb2());
    }
}
