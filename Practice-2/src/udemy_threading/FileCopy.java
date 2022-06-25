package udemy_threading;

import udemy_threading.ioUtils.IOUtils;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CopyTask implements Runnable{
    String src, dest;
    Thread thr;

    public CopyTask(String src, String dest){
        this.src = src;
        this.dest = dest;
        thr = new Thread(this);
    }

    @Override
    public void run() {
        try {
            IOUtils.copyFile(src, dest);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class FileCopy {
    public static void main(String[] args) throws IOException {
        String src1 = "a.txt";
        String src2 = "b.txt";

        String dest1 = "c.txt";
        String dest2 = "d.txt";

        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.execute(new CopyTask(src1, dest1));
        executor.execute(new CopyTask(src2, dest2));

        /*CopyTask ct1 = new CopyTask(src1, dest1);
        CopyTask ct2 = new CopyTask(src2, dest2);
        ct1.thr.start();
        ct2.thr.start();*/
    }
}
