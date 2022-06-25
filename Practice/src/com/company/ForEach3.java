package com.company;

public class ForEach3 {
    public static void main(String[] args) {
        int A[][] = new int[3][4], sum = 0;

        //initialize the 2D array
        for (int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 4 ; j++)
            {
                A[i][j] = (i + 1) * (j + 1);
            }
        }

        //use for-each variation to display the the sum of all the elements of the 2D array
        for(int X[] : A) {
            for (int y : X){
                sum += y;
            }
        }

        System.out.println("The sum of all the elements of the Matrix is : " + sum);
    }
}
