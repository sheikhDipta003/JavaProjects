import java.util.Random;

public class ExceptionCaught2 {
    public static void main(String[] args) {
        int a = 10, b, c;
        Random r = new Random();

        for (int i = 0 ; i < 10 ; i++){
            try{
                b = r.nextInt();
                c = r.nextInt();
                a = 1000 / (b / c);
            } catch (ArithmeticException e){
                System.out.println(e);
                a = 0;
            } finally {
                System.out.println(i + ": " + a);
            }
        }

        System.out.println("\n========================================\n");

        try{
            for(int i = 0 ; i < 10 ; i++){
                b = r.nextInt();
                c = r.nextInt();
                a = 1000 / (b / c);
                System.out.println(i + ": " + a);
            }
        } catch (ArithmeticException e){
            System.out.println(e);
            a = 0;
        }

        System.out.println("Exit");
    }
}
