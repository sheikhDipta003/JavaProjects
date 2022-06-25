public class VarArgs {
    static void VaTest(int ... v){
        System.out.println("Number of arguments received: " + v.length);

        System.out.println("These are - ");
        for(int i: v){
            System.out.println(i);
        }
        System.out.println("=========================================");
    }

    static void VaTest(boolean ... v){
        System.out.println("Number of arguments received: " + v.length);

        System.out.println("These are - ");
        for(boolean i: v){
            System.out.println(i);
        }
        System.out.println("=========================================");
    }

    static void VaTest(String msg, int ... v){
        System.out.println("The message received: " + msg);
        System.out.println("Number of integer arguments received: " + v.length);

        for(int i : v){
            System.out.println(": " + i);
        }
        System.out.println("=========================================");
    }

    static void VaTest(int x){
        System.out.println("x = " + x);
        System.out.println("=========================================");
    }

    /*static void VaTest(int normal, int ... v){
        System.out.println("The normal integer argument: " + normal);
        System.out.println("Number of arguments received: " + v.length);

        System.out.println("These are - ");
        for(int i: v){
            System.out.println(i);
        }
        System.out.println("=========================================");
    }*/

    public static void main(String[] args) {
        // VaTest();    // ambiguous
        VaTest(1, 2, 3);
        VaTest(1, 2);
        VaTest("hello world", 10, 20, 30);
        VaTest(true, false, false, true);
        VaTest(-20);    // how does it resolve which method to call in this line???
    }
}
