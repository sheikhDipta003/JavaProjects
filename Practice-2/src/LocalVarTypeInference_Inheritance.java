class L1{
    int a = -10;
}

class L2 extends L1{
    int b = 20;
}

class L3 extends L2{
    int c = 30;
}

public class LocalVarTypeInference_Inheritance {

    static L1 getObject(int type){
        switch (type){
            case 0: return new L1();
            case 1: return new L2();
            case 2: return new L3();
            default: return null;
        }
    }

    public static void main(String[] args) {
        var x = new L3();
        System.out.println(x.c);

        var y = getObject(0);
        var z = getObject(1);
        var p = getObject(2);
        System.out.println(y.a);
        // System.out.println(z.b);
        // System.out.println(p.c);
        // inferred type is dependent on the superclass, not on subclass
    }

}
