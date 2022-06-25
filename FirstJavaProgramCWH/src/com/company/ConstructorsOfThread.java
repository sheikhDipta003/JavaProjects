package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 0;

        while (i < 5) {
            System.out.println("I am MyThr...");
            i++;
        }
    }
}

public class ConstructorsOfThread {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("HelloWorld");
        MyThr t2 = new MyThr("BidayPrithibi");

        System.out.println("ID of thread t1 : " + t1.getId());
        System.out.println("Name of thread t1 : " + t1.getName());

        System.out.println("ID of thread t2 : " + t2.getId());
        System.out.println("Name of thread t2 : " + t2.getName());

        t1.start();
        t2.start();
    }
}
