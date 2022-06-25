class Thread1 extends Thread {
    private int delay;

    Thread1(String name, int delay){
        super(name);
        this.delay = delay;
        start();
    }

    @Override
    public void run() {
        try{
            for(int i = 5 ; i > 0 ; i--){
                System.out.println(getName() + ": " + i);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

public class ThreadExtending {
    public static void main(String[] args) {
        new Thread1("First child of main thread", 1000);
        new Thread1("Second child of main thread", 4000);

        int i = 0;
        while (true){
            try {
                System.out.println("Main thread: " + (i++));
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
