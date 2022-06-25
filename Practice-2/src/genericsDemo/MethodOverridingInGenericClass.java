package genericsDemo;

class MyGen1<T>{
    T ob;

    public MyGen1(T ob){ this.ob = ob; }

    public T getOb(){
        System.out.print("MyGen1's getOb(): ");
        return this.ob;
    }
}

class MyGen2<T> extends MyGen1<T>{
    public MyGen2(T ob){
        super(ob);
    }

    @Override
    public T getOb(){
        System.out.print("MyGen2's getOb(): ");
        return this.ob;
    }
}

public class MethodOverridingInGenericClass {
    public static void main(String[] args) {
        MyGen1<Integer> iOb1 = new MyGen1<>(100);
        MyGen2<Integer> iOb2 = new MyGen2<>(-56);
        MyGen2<String> strOb = new MyGen2<>("Disgusting world");

        System.out.println(iOb1.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb.getOb());
    }
}
