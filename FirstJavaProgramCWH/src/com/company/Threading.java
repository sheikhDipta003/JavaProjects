package com.company;

class MyThread1 extends Thread{
    @Override
    public void run() {
        int i = 0;

        while (i < 5000) {
            System.out.println("MyThread1 is running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        int i = 0;

        while (i < 600) {
            System.out.println("MyThread2 is running");
            System.out.println("I am not so happy!");
            i++;
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
