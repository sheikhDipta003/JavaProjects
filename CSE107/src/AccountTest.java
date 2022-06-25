//You are given a Java source file (AccountTest.java). Write the necessary classes and
//change the main method accordingly to achieve the output provided at the bottom of the source file.
//You have to submit a single Java file having the same name as the provided source file. You are not allowed
//to submit any zip file. You will be strictly penalized for any plagiarism.

class InvalidAmountException extends Exception {
    private double amount;

    InvalidAmountException(double amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return ("The given amount can’t be negative: " + amount);
    }
}

class InvalidBalanceException extends Exception {
    private double finalBalance;

    InvalidBalanceException(double finalBalance){
        this.finalBalance = finalBalance;
    }

    @Override
    public String toString(){
        return ("The account balance can’t be less than zero: " + finalBalance);
    }
}

interface Account {
    // the following method returns the balance
    double balance();

    // the following method subtracts the amount from the balance,
    // the amount in the method can’t be negative, the balance can’t be negative
    void debit(double amount) throws InvalidAmountException, InvalidBalanceException;

    // the following method adds the amount directly to the balance,
    // the amount in the method can’t be negative
    void credit(double amount) throws InvalidAmountException;
}

class SavingsAccount implements Account{
    private double balance;

    @Override
    public double balance() {
        return balance;
    }

    @Override
    public void debit(double amount) throws InvalidAmountException, InvalidBalanceException {
        System.out.println("Debit Request: " + amount);
        if(amount < 0.0){
            throw new InvalidAmountException(amount);
        }
        else if(balance < amount){
            throw new InvalidBalanceException(balance - amount);
        }
        else
            balance -= amount;
    }

    @Override
    public void credit(double amount) throws InvalidAmountException {
        System.out.println("Credit Request: " + amount);
        if(amount < 0.0){
            throw new InvalidAmountException(amount);
        }
        else
            balance += amount;
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account a = new SavingsAccount();

        try {
            a.credit(1000);
        } catch (InvalidAmountException e) {
            System.out.println(e);
        } finally {
            System.out.println("Balance: " + a.balance());
        }

        try {
            a.credit(-100);
        } catch (InvalidAmountException e) {
            System.out.println(e);
        } finally {
            System.out.println("Balance: " + a.balance());
        }

        try {
            a.debit(2000);
        } catch (InvalidAmountException | InvalidBalanceException e) {
            System.out.println(e);
        } finally {
            System.out.println("Balance: " + a.balance());
        }

        try {
            a.debit(200);
        } catch (InvalidAmountException | InvalidBalanceException e) {
            System.out.println(e);
        } finally {
            System.out.println("Balance: " + a.balance());
        }

        try {
            a.debit(-200);
        } catch (InvalidAmountException | InvalidBalanceException e) {
            System.out.println(e);
        } finally {
            System.out.println("Balance: " + a.balance());
        }
    }
}

/* Output of the main method:
Credit Request: 1000.0
Balance: 1000.0
Credit Request: -100.0
The given amount can’t be negative: -100.0
Balance: 1000.0
Debit Request: 2000.0
The account balance can’t be less than zero: -1000.0
Balance: 1000.0
Debit Request: 200.0
Balance: 800.0
Debit Request: -200.0
The given amount can’t be negative: -200.0
Balance: 800.0
*/