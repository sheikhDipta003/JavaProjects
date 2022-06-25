package com.company;

class Stack {
    //define instance variables
    int stck[] = new int[10];   //a stack
    int tos;   //tos --> top-of-stack

    //constructor
    Stack() {
        tos = -1;   //creates an empty stack
    }

    //insert data onto the stack
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        }
        else {
            stck[++tos] = item;
        }
    }

    //retrieve data from the stack (LIFO)
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            return stck[tos--];
        }
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack mystck1 = new Stack();
        Stack mystck2 = new Stack();

        //give values to the 2 empty stacks
        for (int i = 0 ; i < 10 ; i++)
            mystck1.push(i + 4);
        for (int i = 0 ; i < 10 ; i++)
            mystck2.push(i * 10 + 1);

        //pop values
        System.out.println("Stack - 1");
        for(int i = 0 ; i < 10 ; i++)
            System.out.println(mystck1.pop());
        System.out.println("\nStack - 2");
        for (int i = 0 ; i < 10 ; i++)
            System.out.println(mystck2.pop());
    }
}
