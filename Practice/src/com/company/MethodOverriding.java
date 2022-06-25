package com.company;

class C1{
    int i, j;

    C1(int a1, int b1){
        i = a1;
        j = b1;
    }

    void show_F(){
        System.out.println("i = " + i + "; j = " + j);
    }
}

class C2 extends C1{
    int k;

    C2(int a2, int b2, int x){
        super(a2, b2);
        k = x;
    }

    void show_F(){     //this method overrides the method show_values() in the superclass C1
        //super.show_values();
        System.out.println("k = " + k);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        C2 ob = new C2(10, 20, 30);

        ob.show_F();
    }
}
