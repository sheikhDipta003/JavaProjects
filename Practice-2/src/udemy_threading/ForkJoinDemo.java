package udemy_threading;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SearchTask extends RecursiveTask<Integer>{
    private int [] arr;
    private int start, end;
    private int key;
    public SearchTask(int[] arr, int start, int end, int key){
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.key = key;
    }
    @Override
    protected Integer compute(){
        System.out.println(Thread.currentThread());
        int size = end - start + 1;
        if(size > 3){
            int mid = (end + start) / 2;
            SearchTask task1 = new SearchTask(arr, start, mid, key);
            SearchTask task2 = new SearchTask(arr, mid+1, end, key);
            task1.fork();
            task2.fork();
            return task1.join() + task2.join();
        } else {
            return processSearch();
        }
    }

    public int processSearch() {
        int count=0;
        for(int i = start ; i <= end ; i++){
            if(arr[i] == this.key){
                count++;
            }
        }
        return count;
    }
}

public class ForkJoinDemo {
    public static void main(String[] args) {
        int [] arr = {10, 67, 67, 35, 67, 3, 19, 67, 22, 45, 89, 94};
        int start = 0;
        int end = arr.length - 1;
        int key = 67;

        SearchTask task = new SearchTask(arr, start, end, key);
        ForkJoinPool pool = ForkJoinPool.commonPool();
        int result = pool.invoke(task);

        System.out.printf("%d found %d times", key, result);
    }
}
