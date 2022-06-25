package genericsDemo;

interface MinMax<T extends Comparable<T>>{
    T min();
    T max();
}

//Any class that implements a generic interface must be generic itself.
//However, if a class implements a specific type of generic interface, such as shown here:
//      class randomClass implements MinMax<Integer>{}
//then the implementing class does not need to be generic.

class randomClass<T extends Comparable<T>> implements MinMax<T>{
    T[] arr;

    randomClass(T[] ob){
        arr = ob;
    }

    @Override
    public T min() {
        T min = arr[0];
        for(T t : arr){
            if(t.compareTo(min) < 0)    min = t;
        }
        return min;
    }

    @Override
    public T max() {
        T max = arr[0];
        for(T t : arr){
            if(t.compareTo(max) > 0)    max = t;
        }
        return max;
    }
}

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Integer[] iArr = {100, -40, 50, 90, 0};
        String[] strArr = {"Hello", "World", "Good", "Evening"};
        randomClass<Integer> iOb = new randomClass<>(iArr);
        randomClass<String> strOb = new randomClass<>(strArr);
        System.out.println("Minimum element in iArr: " + iOb.min());
        System.out.println("Maximum element in iArr: " + iOb.max());
        System.out.println("Minimum element in strArr: " + strOb.min());
        System.out.println("Maximum element in strArr: " + strOb.max());
    }
}
