package udemy_threading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class UserMigrateTask implements Runnable{

    @Override
    public void run(){
        int N = 220;
        int batchSize = 100;
        int nPages = (int) Math.ceil((double) N / batchSize);

        ExecutorService executor = Executors.newFixedThreadPool(3);
        CountDownLatch latch = new CountDownLatch(nPages);

        for(int i = 1 ; i <= nPages ; i++) {
            final int pageNo = i;
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Migration - " + pageNo + " is complete.");
                    latch.countDown();
                }
            });
        }

        executor.shutdownNow();

        boolean success = false;
        try{
            success = latch.await(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        if(success) {
            System.out.println("User migration is complete.");
        } else {
            System.out.println("Timed out while waiting for migration to complete.");
        }
    }
}

public class CountDownLatchDemo {
    public static void main(String[] args) {
        new Thread(new UserMigrateTask()).start();
    }
}
