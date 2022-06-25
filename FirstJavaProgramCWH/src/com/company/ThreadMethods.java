package com.company;

class MyNewThr1 extends Thread{
    @Override
    public void run() {
        int i = 0;

        while (i < 1000) {
            System.out.println("Inside MyNewThread1 ...");
            i++;
        }
    }
}

class MyNewThr2 extends Thread{
    @Override
    public void run() {
        int i = 0;

        while (i < 2000) {
            System.out.println("Inside MyNewThread2 ...");
            i++;
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyNewThr1 tn1 = new MyNewThr1();
        MyNewThr2 tn2 = new MyNewThr2();

        try{
            tn1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        tn1.start();
        tn2.start();
    }
}
