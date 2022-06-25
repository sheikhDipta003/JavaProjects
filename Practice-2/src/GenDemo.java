class Gen<T> {
    T ob;
    Gen(T ob){
        this.ob = ob;
    }
    T getOb(){
        return this.ob;
    }
    void showType(){
        System.out.println("Type of T is : " + this.ob.getClass().getSimpleName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<>(100);   //auto-boxing
        int i = iOb.getOb();    //auto-unboxing
        System.out.println(i);
        iOb.showType();

        Gen<String> strOb = new Gen<>("Hello world");   //auto-boxing
        String str = strOb.getOb();     //auto-unboxing
        System.out.println(str);
        strOb.showType();
    }
}
