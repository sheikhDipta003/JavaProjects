class super1{
    int i;

    void show(){
        System.out.println("super1 class, i = " + i);
    }
}

class sub1 extends super1{
    int i;

    sub1(int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("sub1 class, i = " + i);
        System.out.println("super1 class (accessed from sub1), i = " + super.i);
        super.show();
    }
}

public class Super_uses {
    public static void main(String[] args) {
        sub1 ob1 = new sub1(10, 20);
        ob1.show();
    }
}



