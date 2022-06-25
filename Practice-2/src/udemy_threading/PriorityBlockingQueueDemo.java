package udemy_threading;

import java.util.concurrent.PriorityBlockingQueue;

class Student implements Comparable<Student>{
    private String name;
    private int rank;
    public Student(String name, int rank){
        this.name = name;
        this.rank = rank;
    }
    @Override
    public String toString(){
        return String.format("Name: %s, rank: %d", name, rank);
    }
    @Override
    public int compareTo(Student s){
        return (this.rank - s.rank);
    }
}

public class PriorityBlockingQueueDemo {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queueInt = new PriorityBlockingQueue<>();

        queueInt.add(10);
        queueInt.add(4);
        queueInt.add(6);

        System.out.println(queueInt.poll());
        System.out.println(queueInt.poll());
        System.out.println(queueInt.poll());


        PriorityBlockingQueue<Student> queueStd = new PriorityBlockingQueue<>();

        queueStd.add(new Student("a", 10));
        queueStd.add(new Student("b", 3));
        queueStd.add(new Student("c", 6));

        System.out.println(queueStd.poll());
        System.out.println(queueStd.poll());
        System.out.println(queueStd.poll());
        System.out.println(queueStd.poll());
    }
}
