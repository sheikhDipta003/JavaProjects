public class ExceptionUncaught {
    public static void main(String[] args) {
        int a = 10, b = 1, c;

        c = a / b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String s = null;
        System.out.println(s.length());

        System.out.println("Program terminated");
        //Subsequent lines from the line that causes exception will not be executed.
    }
}
