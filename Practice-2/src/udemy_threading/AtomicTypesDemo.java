package udemy_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

class SharedService{
    /*private static boolean initialized = false;*/
    private static AtomicBoolean initialized = new AtomicBoolean(false);

    public void init(){
        if(!initialized.compareAndSet(false, true)){
            System.out.println("Already initialized");
            return;
        }
        //Thread.yield();
        //to demonstrate that if multiple threads access this method at once and see "initialized" as "false",
        //then the resources(imaginary!) will be initialized again
        /*initialized = true;*/
        System.out.println("Initializing ...");
    }
    public void service(){
        init();
        System.out.println("Perform some task");
    }
}

public class AtomicTypesDemo {
    public static void main(String[] args) {
        /*AtomicInteger value = new AtomicInteger(10);
        boolean status = value.compareAndSet(20, 12);
        if(status){
            System.out.println("Value was set to " + value.get());
        } else {
            System.out.println("Value was not set, value = " + value.get());
        }*/

        SharedService service = new SharedService();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int i = 1 ; i <= 3 ; i++){
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    service.service();
                }
            });
        }
        executor.shutdownNow();
    }
}
