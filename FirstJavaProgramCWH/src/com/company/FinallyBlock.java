package com.company;

public class FinallyBlock {
    public static int greet(){
        try{
            int a = 20;
            int b = 2;
            int c = a / b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }

        finally {
            System.out.println("Cleaning up resources ...");
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(greet());
    }

    //Here, if the statement is not inside "finally" block, then "Cleaning up resources" will only run when b == 0.
    //But when b != 0, the function greet() will return c from the try-block and stop execution.
    //That means, if we want, let's say, to "Clean up the resources", we will not be able to do that if b != 0. So, in cases
    //when we want to execute a block of statements WHETHER AN EXCEPTION OCCURS OR NOT, we must use "finally".
}
