package udemy_threading;

class Sync{
    private int x;
    private static int s;
    public void setX(int x){this.x = x;}
    public int getX(){return this.x;}
    public void setS(int t){s = t;}
    public int getS(){return s;}
    //public synchronized void increment(){
    public void increment(){
        //synchronized(this) {
            int y = getX();
            int z = getS();
            y++;
            z++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //introducing delay to simulate complicated operation
            setX(y);
            setS(z);
        //}
    }
}

class MyThread implements Runnable{
    Sync obj;
    Thread thr;
    public MyThread(Sync obj){
        this.obj = obj;
        thr = new Thread(this);
    }
    @Override
    public void run(){
        //If I don't have access to the code of the class, I can use synchronized block on a particular instance as well
        synchronized (obj) {
            obj.increment();
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        Sync obj = new Sync();
        obj.setX(10);
        obj.setS(20);
        MyThread t1 = new MyThread(obj);
        MyThread t2 = new MyThread(obj);
        t1.thr.start();
        t2.thr.start();
        try {
            t1.thr.join();
            t2.thr.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("x = " + obj.getX() + ", s = " + obj.getS());
    }
}
