package practice_3;
//Complete the following Java code that finds the total number of square numbers from a 100000 random integers array using an array of 20 threads in parallel. You cannot write any more classes.

import java.util.Random;

class ParallelSquareCounter implements Runnable {
    private int[] numbers;
    private int startIndex;
    private static final int NUMBER_COUNT = 5000;
    private int squareCount;
	// you are not allowed to add any more fields
	
	// you are not allowed to change this constructor, and you are not allowed to add any more constructor
    ParallelSquareCounter(int[] numbers, int startIndex) {
        this.numbers = numbers;
        this.startIndex = startIndex;
        this.squareCount = 0;
    }
	// your code here
    @Override
    public void run(){
        for(int i = startIndex ; i < (NUMBER_COUNT + startIndex) ; i++){
            int num = numbers[i];
            if(isSquare(num)){
                //System.out.println(num);
                squareCount++;
            }
        }
    }

    public boolean isSquare(int num){
        if(num > 0){
            for(int j = 1 ; j <= num ; j++){
                if((j * j) == num){
                    return true;
                }
            }

            return false;
        }
        else if(num < 0){
            return false;
        }
        else
            return true;
    }

    public int getSquareCount() {
        //System.out.println(squareCount);
        return squareCount;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        final int NUMBER_COUNT = 100000;
        final int THREAD_COUNT = 20;
        int[] numbers = new int[NUMBER_COUNT];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
            //numbers[i] = i * i;
        }
        ParallelSquareCounter[] parallelSquareCounters = new ParallelSquareCounter[THREAD_COUNT];
        Thread[] threads = new Thread[THREAD_COUNT];
		// your code here
        for(int i = 0 ; i < THREAD_COUNT ; i++){
            parallelSquareCounters[i] = new ParallelSquareCounter(numbers, i * 5000);
            threads[i] = new Thread(parallelSquareCounters[i]);
            threads[i].start();
        }

        int totalSquares = 0;
        for(int i = 0 ; i < THREAD_COUNT ; i++){
            threads[i].join();
            totalSquares += parallelSquareCounters[i].getSquareCount();
        }

        System.out.println(totalSquares);
    }
}