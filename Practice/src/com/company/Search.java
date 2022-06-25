package com.company;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, x;
        boolean match = false;

        do {
            //input from the user
            System.out.print("Enter a number: ");
            Scanner S = new Scanner(System.in);
            if (S.hasNextInt()){    //check if the input is an integer or not
                x = S.nextInt();
                break;
            }

        }while(true);

        //search if the value is present
        for (int y: nums){
            if (y == x)
                match = true;
        }

        if (match)
            System.out.println("Value " + x + " has been found");
        else
            System.out.println("Value " + x + " has not been found");

    }
}
