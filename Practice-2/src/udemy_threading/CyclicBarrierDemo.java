package udemy_threading;

//cyclic barrier
//let A and B be two(it maybe more then 2) participants in a game where they should start only when both of them are ready
//Rendezvous Pattern

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class A implements Runnable{
    CyclicBarrier barrier;
    public A(CyclicBarrier barrier){
        this.barrier = barrier;
    }
    @Override
    public void run(){
        try {
            barrier.await();
            //Waits until all parties have invoked await on this barrier.
            //If the current thread is not the last to arrive then it is disabled for thread scheduling purposes and
            //lies dormant until one of the following things happens:
            //The last thread arrives; or
            //Some exception occurs.
        } catch (InterruptedException | BrokenBarrierException exception) {
            exception.printStackTrace();
        }
        System.out.println("A begins ...");
    }
}

class B implements Runnable{
    CyclicBarrier barrier;
    public B(CyclicBarrier barrier){
        this.barrier = barrier;
    }
    @Override
    public void run(){
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException exception) {
            exception.printStackTrace();
        }
        System.out.println("B begins ...");
    }
}

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(2);

        new Thread(new A(barrier)).start();
        //introducing delay to visualize that A proceeds irrespective of whether B is ready or not
        //our goal is to modify this program so that A cannot start until B is ready and B cannot start until A is ready
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        new Thread(new B(barrier)).start();
    }
}
