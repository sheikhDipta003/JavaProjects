package udemy_threading;

import java.util.concurrent.Semaphore;

class PrinterThread implements Runnable{
    private int id;
    private Thread thr;
    private Semaphore semaphore;
    public PrinterThread(int id, Semaphore semaphore){
        this.id = id;
        this.semaphore = semaphore;
        thr = new Thread(this);
    }
    public Thread getThr(){return thr;}
    @Override
    public void run(){
        try{
            semaphore.acquire();
            System.out.println("Printer " + id + " is printing ...");
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new PrinterThread(1, semaphore).getThr().start();
        new PrinterThread(2, semaphore).getThr().start();
        new PrinterThread(3, semaphore).getThr().start();
        new PrinterThread(4, semaphore).getThr().start();
    }
}
