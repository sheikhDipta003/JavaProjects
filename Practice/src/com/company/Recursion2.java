package com.company;

class RecTest{
    //define a 1D array
    int values[];

    //constructor to specify the number of elements this array is going to hold
    RecTest(int i){
        values = new int[i];
    }

    //method to recursively print the array
    void printArray(int i){
        if (i == 0)     return;
        else    printArray(i - 1);

        System.out.println("[ " + (i - 1) + " ]\t" + values[i - 1]);
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);

        //initialize the ob object
        for(int i = 0 ; i < 10 ; i++) {
            ob.values[i] = i;
        }

        //call the recursive method
        ob.printArray(10);
    }
}
