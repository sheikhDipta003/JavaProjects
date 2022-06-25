package MyPack;

class Balance{
    String name;
    double balance;

    //constructor to instantiate an object from this class
    Balance(String n, double b){
        name = n;
        balance = b;
    }

    void show(){
        if (balance < 0){
            System.out.println("-->");
        }
        System.out.println("Current Balance: " + "$" + balance);
    }
}

public class AccountBalance {
    public static void main(String[] args) {
        Balance balances[] = new Balance[3];

        //instantiate 3 objects
        balances[0] = new Balance("J. K. Rowling", 200000);
        balances[1] = new Balance("Robert Downey Junior", 458000);
        balances[2] = new Balance("Bill Gates", 15670000);

        for(int i = 0 ; i < 3 ; i++){
            balances[i].show();
        }
    }
}
