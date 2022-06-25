class D1{
    synchronized void foo(D2 d2){
        System.out.println(Thread.currentThread().getName() + " entered D1.foo()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            System.out.println("Thread was interrupted");
        }

        System.out.println(Thread.currentThread().getName() + " trying to call D2.last()");
        d2.last();
    }

    synchronized public void last() {
        System.out.println("Inside D1.last()");
    }
}

class D2{
    synchronized void bar(D1 d1){
        System.out.println(Thread.currentThread().getName() + " entered D2.bar()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            System.out.println("Thread was interrupted");
        }

        System.out.println(Thread.currentThread().getName() + " trying to call D1.last()");
        d1.last();
    }

    synchronized public void last() {
        System.out.println("Inside D2.last()");
    }
}

public class Deadlock implements Runnable{
    D1 d1 = new D1();
    D2 d2 = new D2();

    Deadlock(){
        Thread t = new Thread(this, "RacingThread");

        t.start();
        d1.foo(d2);
        System.out.println("Back in the main thread");
    }

    @Override
    public void run(){
        d2.bar(d1);
        System.out.println("Back in the other thread");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
