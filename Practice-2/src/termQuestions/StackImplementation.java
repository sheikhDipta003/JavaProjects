package termQuestions;

import java.util.ArrayList;
import java.util.List;

interface iStack<T> {
    void push(T item);
    T pop();
    boolean isEmpty();
}

class Stack<T> implements iStack<T>{
    private int tos;
    private List<T> tList;
    Stack(){
        tos = -1;
        tList = new ArrayList<>();
    }

    @Override
    public void push(T item) {
        tList.add(item);
        tos++;
    }

    @Override
    public T pop() {
        if(tos < 0){
            //System.out.println("Item could not be retrieved, stack is empty");
            System.exit(0);
        }
        return tList.get(tos--);
    }

    @Override
    public boolean isEmpty() {
        return tList.isEmpty();
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(-10);
        myStack.push(23);
        myStack.push(35);
        myStack.push(-56);

        for(int i = 0 ; !myStack.isEmpty(); i++){
            System.out.println("Item no. - " + (5 - i - 1) + ": " + myStack.pop());
        }
    }
}
