package udemy_threading;

class Writer1 implements Runnable{
    Object book;
    Object pen;
    Thread thr;
    Writer1(Object book, Object pen){
        this.book = book;
        this.pen = pen;
        thr = new Thread(this);
    }
    @Override
    public void run(){
        synchronized (book){    //acquire lock over this book object
            try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
            //in order to simulate deadlock condition
            synchronized (pen){ //acquire lock over this pen object
                System.out.println("Writer1 writing");
                //let's assume, a writer has to acquire lock over both book and pen object in order to write
            }
        }
    }
}

class Writer2 implements Runnable{
    Object book;
    Object pen;
    Thread thr;
    Writer2(Object book, Object pen){
        this.book = book;
        this.pen = pen;
        thr = new Thread(this);
    }
    @Override
    public void run(){
        synchronized (pen){    //acquire lock over this pen object
            try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
            //in order to simulate deadlock condition
            synchronized (book){ //acquire lock over this book object
                System.out.println("Writer2 writing");
                //let's assume, a writer has to acquire lock over both book and pen object in order to write
            }
        }
    }
}

public class DeadlockDemo {
    public static void main(String[] args) {
        Object book = new Object();
        Object pen = new Object();

        new Writer1(book, pen).thr.start();
        new Writer2(pen, book).thr.start();

        System.out.println("Main is done.");
        //When applied opposite lock-sequencing to both classes, code works properly, otherwise not.
    }
}
