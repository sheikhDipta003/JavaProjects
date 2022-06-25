package com.company;

//this class(shipment) is a subclass of BoxWeightF, which in turn is a subclass of BoxF
class shipment extends BoxWeightF{
    double cost;

    //constructor of BoxWeightF to clone an object of this class
    shipment(shipment ob){
        super(ob);
        cost = ob.cost;
    }

    //constructor of shipment for uninitialized object
    shipment(){
        super();
        cost = -1;
    }

    //constructor of shipment for cube-shaped object
    shipment(double side, double m, double c){
        super(side, m);
        cost = c;
    }

    //constructor of shipment for general parallelepiped
    shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }
}

public class MultilevelHrchy {
    public static void main(String[] args) {
        shipment ship1 = new shipment(10, 20, 30, 40.5, 100000);
        shipment ship2 = new shipment(20, 50.9, 150000);

        System.out.println("Cost of ship1: " + ship1.cost);
        System.out.println("Cost of ship2: " + ship2.cost);
    }
}
