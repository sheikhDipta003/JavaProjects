package udemy_threading;

class SomeAnotherTask implements Runnable{
    @Override
    public void run(){
        while(true){
            System.out.print("T ");
            /*try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }*/
        }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        Thread thr = new Thread(new SomeAnotherTask());
        thr.setDaemon(true);
        thr.start();
        for(int i = 0 ; i < 200 ; i++){
            System.out.print("M ");
        }
    }
}
