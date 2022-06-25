package genericsDemo;

class Stats<T extends Number> {
    T[] nums;
    Stats(T[] arr){
        nums = arr;
    }
    double average(){
        double sum = 0.0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }
}

public class BoundedTypeParameterDemo {
    public static void main(String[] args) {
        Integer[] intArr = {10, 20, 30, 40, 50};
        Stats<Integer> integerStats = new Stats<>(intArr);
        int iAvg = (int) integerStats.average();
        System.out.println("Average of the int array: " + iAvg);

        Float[] fArr = {-10.5f, -20.5f, -30.5f, 40.5f, 50.5f};
        Stats<Float> floatStats = new Stats<>(fArr);
        float fAvg = (float) floatStats.average();
        System.out.println("Average of the float array: " + fAvg);

        String[] sArr = {"a", "b", "c", "d", "e"};
        //Stats<String> stringStats = new Stats<String>(sArr);
        //compile error, because String class does not extend Number class
    }
}
