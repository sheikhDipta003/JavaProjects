package udemy_threading;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Changed from MessageQueue to BlockingQueue.

class ProducerThread3 extends Thread {
    BlockingQueue<String> queue;

    public ProducerThread3(BlockingQueue<String>  queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i=1; i <= 10; i++) {
            String msg = "Hello-" + i;

            // Blocks the thread until the space is available.
            try {
                queue.put(msg);
                System.out.println("Produced - " + msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class ConsumerThread3 extends Thread {
    BlockingQueue<String> queue;

    public ConsumerThread3(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i=1; i<=10; i++) {
            String message = null;

            // Blocks the thread until the element is available.
            try {
                message = queue.take();
                System.out.println("Consumed - " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);
        new ProducerThread3(queue).start();
        new ConsumerThread3(queue).start();
    }
}
