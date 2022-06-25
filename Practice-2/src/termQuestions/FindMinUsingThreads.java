package termQuestions;

import java.util.Arrays;
import java.util.Random;

class ParallelMin implements Runnable{
    int[] nums = new int[100];
    static int min = Integer.MAX_VALUE;

    @Override
    public void run() {
        for(int i = 1 ; i < nums.length ; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
    }

    public void setNums(int[] N){
        nums = N;
    }

    public static int getMin(){return min;}
    public static void setMin(int a_min){min=a_min;}
}

public class FindMinUsingThreads {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[500];
        int [] temp;

        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = random.nextInt(200) + 100;
            System.out.print(numbers[i]+"\t");
        }

        ParallelMin[] parallelMin = new ParallelMin[5];
        Thread[] thr = new Thread[5];
        /*for(int i = 0 ; i < thr.length ; i++){
            temp = Arrays.copyOfRange(numbers, i*100, (i+1)*100);
            parallelMin[i] = new ParallelMin();
            parallelMin[i].setNums(temp);
            thr[i] = new Thread(parallelMin[i]);
        }*/
        for(int i = 0 ; i < thr.length ; i++){
            parallelMin[i] = new ParallelMin();
            int index = i;
            thr[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = index*100 ; j < (index+1)*100 ; j++){
                        if(ParallelMin.getMin() > numbers[j]){
                            ParallelMin.setMin(numbers[j]);
                        }
                    }
                }
            });
        }
        for(int i = 0 ; i < thr.length ; i++){
            thr[i].start();
        }

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("\nMinimum = " + ParallelMin.getMin());
    }
}
