package termQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruit implements Comparable<Fruit>{

    private String name;
    private int quantity;
    private static final List<Fruit> listFruits = new ArrayList<>();

    public Fruit(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Fruit f1 = new Fruit("apple", 20);
        Fruit f2 = new Fruit("banana", 10);
        Fruit f3 = new Fruit("cherry", 50);
        Fruit f4 = new Fruit("mango", 25);
        Fruit f5 = new Fruit("jack-fruit", 35);
        Fruit f6 = new Fruit("berry", 10);
        Fruit f7 = new Fruit("pineapple", 50);
        Fruit f8 = new Fruit("orange", 70);
        Fruit f9 = new Fruit("strawberry", 35);
        Fruit f10 = new Fruit("cucumber", 30);

        listFruits.add(f1);
        listFruits.add(f2);
        listFruits.add(f3);
        listFruits.add(f4);
        listFruits.add(f5);
        listFruits.add(f6);
        listFruits.add(f7);
        listFruits.add(f8);
        listFruits.add(f9);
        listFruits.add(f10);

        Collections.sort(listFruits);

        for (Fruit listFruit : listFruits) {
            System.out.println(listFruit.name + ", " + listFruit.quantity);
        }
    }

    @Override
    public int compareTo(Fruit f){
        if(this.quantity != f.quantity){
            return (this.quantity - f.quantity);
        } else {
            return this.name.compareTo(f.name);
        }
    }
}
