class Q{
    int n;
    boolean isEmpty = true;

    synchronized public int getN() {
        while (isEmpty){
            try {
                wait();
            } catch (InterruptedException exception) {
                System.out.println("Thread was interrupted");
            }
        }
        System.out.println("Got: " + n);
        isEmpty = true;
        notify();
        return n;
    }

    synchronized public void setN(int n) {
        while (!isEmpty){
            try {
                wait();
            } catch (InterruptedException exception) {
                System.out.println("Thread was interrupted");
            }
        }
        this.n = n;
        System.out.println("Put: " + this.n);
        isEmpty = false;
        notify();
    }
}

class Producer implements Runnable{
    Q q;
    Producer(Q q){
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run(){
        int i = 0;

        while(i < 100){
            q.setN(i++);
        }
    }
}

class Consumer implements Runnable{
    Q q;
    Consumer(Q q){
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run(){
        int i = 0;
        while(i < 100){
            q.getN();
            i++;
        }
    }
}

public class Threads_QueuingProblem {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Press control-C to force stop");
    }
}
