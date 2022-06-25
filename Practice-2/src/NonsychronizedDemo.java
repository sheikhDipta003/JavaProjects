class CallMe{
    void call(String message){
        System.out.print("[" + message);

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("Thread was interrupted");
        }

        System.out.println("]");
    }
}

class Caller implements Runnable{
    String message;
    CallMe target;
    Thread t;

    public Caller(CallMe target, String message){
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

public class NonsychronizedDemo {
    public static void main(String[] args) {
        CallMe main_target = new CallMe();
        Caller ob1 = new Caller(main_target, "Hello");
        Caller ob2 = new Caller(main_target, "Synchronized");
        Caller ob3 = new Caller(main_target, "World");

        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e){
            System.out.println("Thread was interrupted");
        }
    }
}
