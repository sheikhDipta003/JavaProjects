package udemy_threading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import udemy_threading.myMath.Sum;

public class FindSumUsingThreads {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int[] arr = new int[500];
        Random random = new Random();
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = random.nextInt(100);
        }
        int sum = 0;

        //parallel approach
        List<Future<Integer>> sumsList = new ArrayList<>();
        int numOfThr = (int)Math.ceil((double)arr.length/3);

        ExecutorService executor = Executors.newFixedThreadPool(numOfThr);
        long startTime = System.currentTimeMillis();
        Thread thr = new Thread(()->{
            for(int i = 0 ; i < numOfThr ; i++){
                int count = i*3;
                Future<Integer> future = executor.submit(
                        () -> Sum.getSum(Arrays.copyOfRange(arr, count, count+3))
                );
                sumsList.add(future);
            }
        });
        thr.start();
        thr.join();

        for(Future<Integer> obj : sumsList){
            sum += getValue(obj);
        }
        System.out.println("Time taken for finding sum - " + (System.currentTimeMillis() - startTime));
        System.out.println("Sum = " + sum);
        executor.shutdownNow();

        //serial approach
        long startTime2 = System.currentTimeMillis();
        for(int i : arr){
            sum += i;
        }
        System.out.println("Time taken for finding sum - " + (System.currentTimeMillis() - startTime2));
        System.out.println("Sum = " + sum);
    }

    public static int getValue(Future<Integer> future) throws ExecutionException, InterruptedException {
        while(!future.isDone()){
            Thread.yield();
        }
        return future.get();
    }
}
