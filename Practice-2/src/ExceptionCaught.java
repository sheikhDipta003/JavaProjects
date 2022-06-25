public class ExceptionCaught {
    public static void main(String[] args) {
        int a = 10, b = 0, c = 0;

        try{
            c = a / b;
            System.out.println("Inside try block");
        } catch (Exception e){
            System.out.println(e);
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Inside finally");
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("===========================================");
        String s = null;
        try{
            System.out.println(s.length());
            System.out.println("Inside second try block");
        } catch (Exception e){
            System.out.println(e);
            System.out.println("Inside second catch block");
        } finally {
            System.out.println("Inside second finally block");
        }

        System.out.println("Program terminated");
    }
}
