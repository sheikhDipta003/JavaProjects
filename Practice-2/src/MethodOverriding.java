class MO1{
    int i, j;

    MO1(int i, int j){
        this.i = i;
        this.j = j;
    }

    void show(){
        System.out.println("i = " + i + "; j = " + j);
    }
}

class MO2 extends MO1{
    int k;

    MO2(int i, int j, int k){
        super(i, j);
        this.k = k;
    }

    @Override
    void show(){
        super.show();
        System.out.println("k = " + k);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        MO2 ob2 = new MO2(-10, 10, 20);
        ob2.show();

        System.out.println("\n========================================\n");
        MO1 ob1 = ob2;
        ob1.show();
        // Still calls the overridden method of ob2, because automatic late binding occurs in Java.
    }
}
