package com.company;

class Stack2{
    private int stck[];
    private int tos;

    Stack2(int i){
        stck = new int[i];
        tos = -1;
    }

    //push an item onto the stack
    void push(int num){
        if (tos == stck.length - 1)
            System.out.println("Stack full");
        else
            stck[++tos] = num;
    }

    //pop an item from the stack
    int pop(){
        if (tos < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}

public class TestStack2 {
    public static void main(String[] args) {
        Stack2 mystack1 = new Stack2(5);
        Stack2 mystack2 = new Stack2(10);

        //initialize both stacks
        for(int i = 0 ; i < 5 ; i++)
            mystack1.push(i * 5 + 1);
        for(int i = 0 ; i < 10 ; i++)
            mystack2.push(i * 10 + 1);

        //pop all elements from both stack
        System.out.println("Stack --> 1");
        for(int i = 0 ; i < 5 ; i++)
            System.out.println(mystack1.pop());

        System.out.println("\nStack --> 2");
        for(int i = 0 ; i < 10 ; i++)
            System.out.println(mystack2.pop());
    }
}
