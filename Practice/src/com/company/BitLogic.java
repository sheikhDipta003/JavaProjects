package com.company;

public class BitLogic {
    public static void main(String[] args) {
        String binary[] = {"0000", "0001", "0010", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
                "1011", "1100", "1101", "1110", "1111"};
        int a = 3;  //0011  ; ~a = 1100
        int b = 6;  //0110  ; ~b = 1001
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        int x = 0b1100;
        System.out.println("x  = " + x);

        System.out.println("a =\t" + binary[a]);
        System.out.println("a =\t" + binary[b]);
        System.out.println("a | b =\t" + binary[c]);
        System.out.println("a & b =\t" + binary[d]);
        System.out.println("a ^ b =\t" + binary[e]);
        System.out.println("(~a & b) | (a & ~b) =\t" + binary[f]);
        System.out.println("~a =\t" + binary[g]);
    }
}
