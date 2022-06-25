class NewChild implements Runnable{
    Thread t;
    private int delay;

    NewChild(String name, int delay){
        t = new Thread(this);
        t.setName(name);
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int i = 5 ; i > 0 ; i--){
                System.out.println(t.getName() + ": " + i);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

public class Runnable_Thread {
    public static void main(String[] args) {
        new NewChild("First child of main thread", 1000);

        int i = 0;
        while (true){
            try {
                System.out.println("Main thread: " + (i++));
                Thread.sleep(3000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
