class MO_1{
    int i, j;

    MO_1(int i, int j){
        this.i = i;
        this.j = j;
    }

    void show(){
        System.out.println("i = " + i + "; j = " + j);
    }
}

class MO_2 extends MO_1{
    int k;

    MO_2(int i, int j, int k){
        super(i, j);
        this.k = k;
    }

    void show(String message){
        System.out.println(message);
        super.show();
        System.out.println("k = " + k);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MO_2 ob_2 = new MO_2(-10, 20, 30);
        ob_2.show();
        ob_2.show("\nGood evening");
    }
}


