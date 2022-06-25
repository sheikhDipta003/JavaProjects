package udemy_threading;

import udemy_threading.ioUtils.PatternFinder;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PatternSearchInFolder {
    public static void main(String[] args) throws Exception {
        String pattern = "tournament";
        File dir = new File("demoFiles");
        File [] files = dir.listFiles();
        PatternFinder finder = new PatternFinder();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        HashMap<String,Object> resultMap = new HashMap<>(); //filename, Future object

        long startTime = System.currentTimeMillis();
        for(File file : files){
            //searching the file for the pattern - parallel approach
            Future<List<Integer>> lineNumbers = executor.submit(()-> finder.find(file, pattern));
            resultMap.put(file.getName(), lineNumbers);

            //searching the file for the pattern - serial approach
            /*List<Integer> lineNumbers = finder.find(file, pattern);
            if(!lineNumbers.isEmpty()){
                System.out.println(pattern + " found at " + lineNumbers + " in the file - " + file.getName());
            }*/
        }

        waitForAll(resultMap);

        // Display the result.
        for (Map.Entry<String, Object> entry : resultMap.entrySet()) {
            System.out.println(pattern + " found at - " + entry.getValue() + " in file " + entry.getKey());
        }

        System.out.println("Time taken for finding match - " + (System.currentTimeMillis() - startTime));
    }

    private static void waitForAll(HashMap<String, Object> resultMap) throws Exception {
        Set<String> keys = resultMap.keySet();
        for(String key : keys){
            Future<List<Integer>> future = (Future<List<Integer>>)resultMap.get(key);
            while(!future.isDone()){
                Thread.yield();
            }
            resultMap.put(key, future.get());
        }
    }
}
