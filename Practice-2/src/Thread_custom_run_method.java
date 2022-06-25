public class Thread_custom_run_method {

    public static void main(String[] args) {
        Thread_custom_run_method cr = new Thread_custom_run_method();
        //new Thread(cr::f1, "Thread1").start();
        // "::(method reference operator)" was introduced in java after jdk 8. Through this operator, we can take the
        //reference of a method. Actually, in line no. 4., we are telling java runtime to use f1() as a custom
        //run() method for the thread object, it is not invoked in that line.

        new Thread(Thread_custom_run_method::f2, "Thread2").start();
        //Therefore, it is not mandatory for the custom run method to have the same signature as run().
    }

    public void f1(){
        try{
            for(int i = 5 ; i > 0 ; i--){
                System.out.println("Child thread - 1: " + i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void f2(){
        try{
            for(int i = 10 ; i <= 15 ; i++){
                System.out.println("Child thread - 2: " + i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
