package genericsDemo;

class SuperNonGen{
    int i;
    public SuperNonGen(int i){ this.i = i; }
    public int getI(){ return this.i; }
}

//a generic subclass can extend a non-generic superclass
class SubGen<T> extends SuperNonGen{
    T ob;

    public SubGen(int i, T ob){
        super(i);
        this.ob = ob;
    }

    T getOb(){ return this.ob; }
}

public class GenericSubclass {
    public static void main(String[] args) {
        SubGen<String> sub1 = new SubGen<>(100, "I hate everything about my life");
        System.out.println("ob = " + sub1.getOb());
        System.out.println("i = " + sub1.getI());
    }
}
