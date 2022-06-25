package udemy_threading.myMath;

public class Sum {
    public static int getSum(int ... v){
        int temp = 0;

        for(int i : v){
            temp += i;
        }
        return temp;
    }
}
