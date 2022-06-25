package com.company;

//import java.util.Scanner;     //--> Method-1
//import java.util.*;   //--> Method-2

public class PackagesUsing {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("This is my scanner following Method-1");
        //System.out.println("This is my scanner following Method-2");

        java.util.Scanner sc = new java.util.Scanner(System.in);    //--> Method-3
        int a = sc.nextInt();
        System.out.println("This is my scanner following Method-3 taking " + a + " as input");
    }
}
