package com.company;

/**
 * Contains a main method to display the functionality of for-each loop
 */
public class ForEach {

    /**
     * The entry point to the program.
     * Displays the use of for-each loop.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, sum = 0;

        // use for-each style to find the sum and display it
        for (int x : nums){
            sum += x;
        }

        System.out.println("The sum of integers from 0 to 10 is : " + sum);
    }
}
