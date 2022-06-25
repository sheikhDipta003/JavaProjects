package udemy_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyMath{
    public static int add(int x, int y){
        return (x + y);
    }
}

public class CallableInterface {
    public static void main(String[] args) {
        int x = 20, y = 10;
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(
                () -> MyMath.add(x, y)
        );

        //do some parallel task here

        while(!future.isDone());
        //don't progress further until the addition task is completed

        try{
            System.out.println("Result = " + future.get());
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
