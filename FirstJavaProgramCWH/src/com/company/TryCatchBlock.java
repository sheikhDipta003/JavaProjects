package com.company;

public class TryCatchBlock {
    public static void main(String[] args) {
        int a = 1000, b = 0, c;

        //Without try-catch block
        /*c = a / b;
        System.out.println("c = " + c);*/

        // With try-catch block
        try{
            c = a / b;      //try to execute these two statements
            System.out.println("c = " + c);
        }
        catch (Exception e){        //in case of failure, catch the exception in parameter "e" and execute these
            System.out.println("We could not perform the division. Reason: ");  //two lines instead
            System.out.println(e);
        }

        System.out.println("End of the program");
        //This line will be executed when we use try-catch block. But if we don't use try-catch block, our program
        //will be terminated and will throw exception as soon as java compiler reaches 8-th line, i.e. java compiler will not
        //compile statements after that line.
    }
}
