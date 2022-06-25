package genericsDemo;

class Stats2<T extends Number> {
    T[] nums;
    Stats2(T[] arr){
        nums = arr;
    }
    double average(){
        double sum = 0.0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }
    boolean sameAverage(Stats2<?> ob){
        if(average() == ob.average()){
            return true;
        }
        return false;
    }
}

public class WildcardArgumentsDemo {
    public static void main(String[] args) {
        Integer[] intArr = {10, 20, 30, 40, 50};
        Stats2<Integer> integerStats = new Stats2<>(intArr);
        double v = integerStats.average();
        System.out.println("Average of the int array: " + v);

        Float[] fArr = {-10.5f, -20.5f, -30.5f, 40.5f, 50.5f};
        Stats2<Float> floatStats = new Stats2<>(fArr);
        v = floatStats.average();
        System.out.println("Average of the float array: " + v);

        Double[] dArr = {10.0, 20.0, 30.0, 40.0, 50.0};
        Stats2<Double> doubleStats = new Stats2<>(dArr);
        v = doubleStats.average();
        System.out.println("Average of the double array: " + v);

        System.out.println("intArr and fArr have the same average: " + integerStats.sameAverage(floatStats));
        System.out.println("intArr and dArr have the same average: " + integerStats.sameAverage(doubleStats));
    }
}
