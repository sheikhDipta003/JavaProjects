class NewChild2 implements Runnable{

    @Override
    public void run() {
        try{
            for(int i = 5 ; i > 0 ; i--){
                System.out.println("Child thread - 1" + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

public class Runnable_Thread_2 {
    public static void main(String[] args) {
        Runnable r = new NewChild2();
        Thread t1 = new Thread(r);
        t1.start();

        System.out.println("==================================");
        Thread t2 = new Thread(() -> {
            try{
                for(int i = 1 ; i <= 5 ; i++){
                    System.out.println("Child thread - 2" + ": " + i);
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e){
                System.out.println(e);
            }
        });
        t2.start();
    }
}
