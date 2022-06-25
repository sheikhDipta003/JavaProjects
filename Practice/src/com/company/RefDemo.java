package com.company;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight mybox_1 = new BoxWeight(10, 15, 20, 100.5);
        Box9 mybox_2 = new Box9();

        System.out.println("Volume of mybox_1 (an instance of the subclass of Box): " + mybox_1.volume());
        System.out.println("Weight of mybox_1 (an instance of the subclass of Box): " + mybox_1.weight);
        System.out.println("Volume of mybox_2 (an instance of superclass Box): " + mybox_2.volume());

        //assign the reference of the subclass(BoxWeight) to the superclass(Box)
        mybox_2 = mybox_1;

        //volume of mybox_2 after this assignment
        System.out.println("Volume of mybox_2 (an instance of superclass Box): " + mybox_2.volume());

        //System.out.println("Weight of mybox_2 (an instance of the subclass of Box): " + mybox_2.weight);
        //the above line of code is erroneous; although the superclass ref var(mybox_2) is assigned the ref to subclass
        //object(mybox_1), it(mybox_2) can only access only those parts of mybox_1 which is defined in the superclass
        //(Box). Since the instance var "weight" is not defined in the superclass Box, mybox_2 can't access it.
    }
}
