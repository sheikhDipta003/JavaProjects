class Caller3 implements Runnable{
    String message;
    CallMe target;
    Thread t;

    public Caller3(CallMe target, String message){
        this.target = target;
        this.message = message;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){
        synchronized (target) {
            target.call(message);
        }
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        CallMe main_target = new CallMe();
        Caller3 ob1 = new Caller3(main_target, "Hello");
        Caller3 ob2 = new Caller3(main_target, "Synchronized");
        Caller3 ob3 = new Caller3(main_target, "World");

        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e){
            System.out.println("Thread was interrupted");
        }
    }
}
