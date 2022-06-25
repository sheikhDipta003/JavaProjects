package udemy_threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class ProducerThread2 implements Runnable{
    Thread thr;
    BlockingQueue<String> queue;
    public ProducerThread2(BlockingQueue<String> queue){
        this.queue = queue;
        this.thr = new Thread(this);
    }
    @Override
    public void run(){
        for(int i=1; i <= 10; i++) {
            String msg = "Hello-" + i;
            try{
                queue.put(msg);
                System.out.println("Produced - " + msg);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class ConsumerThread2 implements Runnable{
    Thread thr;
    BlockingQueue<String> queue;
    public ConsumerThread2(BlockingQueue<String> queue){
        this.queue = queue;
        this.thr = new Thread(this);
    }
    @Override
    public void run(){
        for(int i=1; i <= 10; i++) {
            String msg;
            try {
                msg = queue.take();
                System.out.println("Consumed - " + msg);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerProblem2 {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        new ProducerThread2(queue).thr.start();
        new ConsumerThread2(queue).thr.start();
    }
}
