import java.util.Scanner;

interface ABS{
    //A class implementing an interface containing default methods is under no obligation to override those default methods.
    //Except some circumstances!
    default double convertToDouble(String s){
        System.out.println("In the ABS interface");
        return Double.parseDouble(s);
    }

    //An interface can contain multiple default methods
    default int convertToInt(String s){
        System.out.println("In the ABS interface");
        return Integer.parseInt(s);
    }

    void showAbs(String input);
}

interface Floor{
    default double convertToDouble(String s){
        System.out.println("In the Floor interface");
        return Double.parseDouble(s);
    }
}

interface Ceiling extends ABS{
    default int convertToInt(String s){
        System.out.println("In the Ceiling interface");
        return Integer.parseInt(s);
    }
}

class MyClass implements ABS, Ceiling, Floor{

    @Override
    public double convertToDouble(String s) {
        System.out.println("In the MyClass class");
        return Double.parseDouble(s);
    }
    //When a class implements two interfaces(without inheritance relationship) containing default methods of the same signature, that class MUST override that default method.
    //On the other hand, if two interfaces maintain inheritance relationship, then the class might not override the default method.

    @Override
    public void showAbs(String input) {
        double num = convertToDouble(input);
        num = (num < 0.0) ? -num : num;

        System.out.println("Absolute value of " + input + " is = " + num);
    }
}

public class DefaultInterfaceMethod {
    public static void main(String[] args) {
        do{
            System.out.print(": ");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            if(userInput.equalsIgnoreCase("QUIT")){
                break;
            }

            MyClass ob = new MyClass();
            ob.showAbs(userInput);
        }while (true);
    }
}
