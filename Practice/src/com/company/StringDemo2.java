package com.company;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Good Evening";
        String s3 = s1;

        if (s1.equals(s2) == true){
            System.out.println("The strings s1 and s2 are equal");
        }
        else
            System.out.println("The strings s1 and s2 are not equal");
        System.out.println("Length of s1 = " + s1.length());
        System.out.println("First character of s1 = " + s1.charAt(0));
        System.out.println("Last character of s1 = " + s1.charAt(s1.length() - 1));

        if (s2.equals(s3) == true){
            System.out.println("\nThe strings s2 and s3 are equal");
        }
        else
            System.out.println("\nThe strings s2 and s3 are not equal");
        System.out.println("Length of s2 = " + s2.length());
        System.out.println("First character of s2 = " + s2.charAt(0));
        System.out.println("Last character of s2 = " + s2.charAt(s2.length() - 1));

        if (s3.equals(s1) == true){
            System.out.println("\nThe strings s1 and s3 are equal");
        }
        else
            System.out.println("\nThe strings s1 and s3 are not equal");
        System.out.println("Length of s3 = " + s3.length());
        System.out.println("First character of s3 = " + s3.charAt(0));
        System.out.println("Last character of s3 = " + s3.charAt(s3.length() - 1));
    }
}
