package udemy_threading;

class SomeTask implements Runnable{
    @Override
    public void run(){
        try{
            Thread.sleep(5000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class ThreadGroupDemo {
    public static void main(String[] args) {

        //ThreadGroup myGroup = new ThreadGroup("MyGroup");
        //myGroup.setMaxPriority(7);
        //Sets the maximum priority of the group. No thread under this group will have priority greater than 7.
        //Threads in the thread group that already have a higher priority are not affected.

        //new Thread(myGroup, new SomeTask(), "ChildThread-1").start();
        new Thread(new SomeTask(), "ChildThread-1").start();

        Thread thr = Thread.currentThread();
        ThreadGroup group = thr.getThreadGroup();
        //Returns the thread group to which this thread belongs. This method returns null if this thread has died (been stopped).

        while(group.getParent()!=null){
            group = group.getParent();
            //Returns: the parent of this thread group. The top-level thread group is the only thread group whose parent is null.
        }

        Thread [] threads = new Thread[10];
        int n = group.enumerate(threads);
        //Copies into the specified array every active thread in this thread group and its subgroups.
        //Returns: the number of threads put into the array

        for(int i = 0 ; i < n ; i++){
            System.out.println("Thread name: " + threads[i].getName() + ", isDaemon: " + threads[i].isDaemon());
        }
        //group.list();
        //Prints information about this thread group to the standard output. This method is useful only for debugging.
    }
}
