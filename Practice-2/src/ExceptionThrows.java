public class ExceptionThrows {
    public static void f2() throws IllegalAccessException {
        throw new IllegalAccessException("illegal use of access modifier");
        //By using the throws keyword in the method signature, we are informing the caller method that this method
        //MAY throw an IllegalAccessException and the caller method MUST handle it regardless of whether actually an
        //exception is thrown or not. Otherwise, the program WILL NOT COMPILE. This type of exception is required
        //to be handled either in the calling method or in the container class for successful compilation of the
        //program.
    }

    public static void main(String[] args) {
        try {
            f2();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
