package com.company;

class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i = 0;

        while (i < 1000) {
            System.out.println("1: I am a thread, not a threat");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i = 0;

        while (i < 100) {
            System.out.println("2: I am also a thread, not a threat");
            i++;
        }
    }
}

public class Threading2 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);  //Inside Thread(), we must give an object whose run() method is to be invoked;
                                            //in other words, whose class implements "Runnable" interface

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);  //Inside Thread(), we must give an object whose run() method is to be invoked;
                                            //in other words, whose class implements "Runnable" interface
        gun1.start();
        gun2.start();
    }
}
