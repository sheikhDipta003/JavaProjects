package termQuestions;

class SomeClass{
    static int a;
    static String s;

    public void show(){
        System.out.println("a = " + a + "\ns = " + s);
    }

    static{
        a = 10;
        s = "Good morning";
        System.out.println("Inside the first static block");
    }

    static {
        a = -10;
        s = "Good evening";
        System.out.println("Inside the second static block");
    }
    //Conclusion:
    //1. There can be multiple static blocks in a class.
    //2. These blocks are executed in order from top to bottom.
}

public class MultipleStaticBlocks {
    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        obj.show();
    }
}
