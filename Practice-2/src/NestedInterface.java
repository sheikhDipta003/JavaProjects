class NI{
    interface NestedIF{
        boolean isNonNegative(int x);
    }
}

class childNI implements NI.NestedIF /*extends NI*/{
    @Override
    public boolean isNonNegative(int x) {
        return (x >= 0);
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        childNI ob1 = new childNI();
        System.out.println("100 is non-negative : " + ob1.isNonNegative(100));

        NI.NestedIF ref = new childNI();
        System.out.println("-100 is non-negative : " + ref.isNonNegative(-100));
    }
}
