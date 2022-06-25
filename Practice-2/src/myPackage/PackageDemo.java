package myPackage;

class Balance{
    private String name;
    private double bal;

    Balance(String name, double bal){
        this.name = name;
        this.bal = bal;
    }

    void show(){
        System.out.println(name + ": $" + bal);
    }
}

public class PackageDemo {
    public static void main(String[] args) {
        Balance[] current = new Balance[3];
        current[0] = new Balance("Bill Gates", 100000000.0);
        current[1] = new Balance("Jeff Bezos", 230000000.0);
        current[2] = new Balance("Steve Jobs", 12500000.0);

        for(Balance b : current){
            b.show();
        }
    }
}
