package com.company;

public class FinallyBlock2 {
    public static void main(String[] args) {
        int myArray[] = {100, 200, 300, 400, 50, 60, 760};

        for(int i: myArray){
            try{
                System.out.println("From try: " + i / (i - 50));
            }
            catch (Exception e){
                System.out.println("From catch: i = " + i + "; " + e);
                if (i == 50)
                    break;
            }

            finally {
                System.out.println("From finally: i = " + i);
            }
        }

        //we can use try-finally as follows
        try{
            System.out.println("\n" + 50/0);
        }
        finally {
            System.out.println("\nInside 2nd finally ...");
        }

        //*** "finally" MUST be used in the SAME SCOPE as "try-catch", i.e. it CANNOT be used without "try"
    }
}
