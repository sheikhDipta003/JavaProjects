public class ExceptionThrow {
    public static void f(){
        throw new NullPointerException("cannot access null reference");
        //The string inside the constructor actually overrides the existing message in NullPointerException class.
    }

    public static void main(String[] args) {
        try{
            f();
        } catch (NullPointerException e){
            //System.out.println(e);
            System.out.println(e.getMessage());
        }
        f();
    }

    //For this type of runtime exception, the program WILL COMPILE even if the calling method does not handle the thrown
    //exception [it will crash, however].
}
