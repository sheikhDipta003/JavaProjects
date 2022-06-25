package termQuestions;

import java.util.Scanner;

interface SomeFunc<T>{
    T func(T t);
}

public class ComputeFactorialWithFuncInterface {
    public static void main(String[] args) {
        SomeFunc<Integer> someFunc;
        System.out.print("Enter a positive integer: ");
        Integer i = Integer.parseInt(new Scanner(System.in).nextLine());
        someFunc = (n) -> {
            Integer result = 1;
            do{
                result *= n;
                n--;
            }while (n != 0);
            return result;
        };

        System.out.println("Factorial of " + i + ": " + someFunc.func(i));
        //Implementing given functional interface with lambda expression to compute factorial.
    }
}
