package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Inside " + this.getName());
        }
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Red");
        MyThr1 t2 = new MyThr1("Blue");
        MyThr1 t3 = new MyThr1("Green");
        MyThr1 t4 = new MyThr1("Orange");
        MyThr1 t5 = new MyThr1("Yellow (Most important)");

        //priority of t5 will be the highest
        t5.setPriority(Thread.MAX_PRIORITY);

        //priority of t1, t2, t3 & t4 will be the lowest
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        //From the output, we can see that the print statement inside t5.run() gets executed maximum number of times.
        //That is, its priority is the highest among all the threads. However, we must not rely COMPLETELY on setting priorities
        //from our end, because the execution of threads also depends upon the Operating System HIGHLY.
    }
}
