public class CatchMultiple {
    public static void main(String[] args) {
        int a = 10, b = 0, c = 0;

        try{
            System.out.println("In try");
            c = a / b;
        } catch (ArithmeticException | NullPointerException e){
            System.out.println("In catch");
            System.out.println(e);

            if(e.getClass().getSimpleName().equals("ArithmeticException")){
                System.out.println("ArithmeticException: division by zero");
            } else if(e.getClass().getSimpleName().equals("NullPointerException")){
                System.out.println("NullPointerException: cannot access null reference");
            }
        } finally {
            System.out.println("In Finally");
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
