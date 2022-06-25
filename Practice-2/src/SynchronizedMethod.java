class CallMe2{
    synchronized void call(String message){
        System.out.print("[" + message);

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("Thread was interrupted");
        }

        System.out.println("]");
    }
}

class Caller2 implements Runnable{
    String message;
    CallMe2 target;
    Thread t;

    public Caller2(CallMe2 target, String message){
        this.target = target;
        this.message = message;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){
        target.call(message);
    }
}

public class SynchronizedMethod {
    public static void main(String[] args) {
        CallMe2 main_target = new CallMe2();
        Caller2 ob1 = new Caller2(main_target, "Hello");
        Caller2 ob2 = new Caller2(main_target, "Synchronized");
        Caller2 ob3 = new Caller2(main_target, "World");

        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e){
            System.out.println("Thread was interrupted");
        }
    }
}
