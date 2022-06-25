package udemy_threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//The most preferred approach for achieving synchronization
class SyncDiff{
    private int x;
    ReadWriteLock rw_lock;
    SyncDiff(){rw_lock = new ReentrantReadWriteLock();}
    public void setX(int x){this.x = x;}
    public int getX(){return this.x;}

    public void increment(){
        Lock lock = rw_lock.writeLock();
        //There are two kinds of lock objects - writeLock and readLock
        //readLock allows us to lock the object for read operation, and the interesting point is that the read operation
        //can be shared i.e if two threads are waiting for readLock then both of them can proceed forward with the
        //operation as read operation doesn't change the data.
        //Whereas writeLock is mutually exclusive i.e. if a writeLock is accepted then all the other lock requests
        //should wait till the thread that owns the lock releases it.

        lock.lock();

        try {
            int y = getX();
            y++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //introducing delay to simulate complicated operation
            setX(y);
        } finally{
            lock.unlock();
            //written inside finally block so that it always gets executed even if some exception arises
        }
    }
}

class MyOtherThread implements Runnable{
    SyncDiff obj;
    Thread thr;
    public MyOtherThread(SyncDiff obj){
        this.obj = obj;
        thr = new Thread(this);
    }
    @Override
    public void run(){
        obj.increment();
    }
}

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        SyncDiff obj = new SyncDiff();
        obj.setX(10);
        MyOtherThread t1 = new MyOtherThread(obj);
        MyOtherThread t2 = new MyOtherThread(obj);
        t1.thr.start();
        t2.thr.start();
        try {
            t1.thr.join();
            t2.thr.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("x = " + obj.getX());
    }
}
