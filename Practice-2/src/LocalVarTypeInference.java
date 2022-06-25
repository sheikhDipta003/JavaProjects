class C1{
    int x = 100;
    //var y = 20.383;   //cannot be used as instance variable
    void display(){
        System.out.println("Inside class C1");
        System.out.println("x = " + x);
    }
}

public class LocalVarTypeInference {
    public static void main(String[] args) {
        var myArray = new int[10];
        // var someValue;   //not allowed
        //var greetings = null;     //not allowed
        // var [] myArray2 = new int[10];   // not allowed
        // var myArray = {1, 2, 3};    // not allowed

        for(var i = 0 ; i < myArray.length ; i++){
            myArray[i] = (i + 1) * 10;
        }

        for(var i = 0; i < myArray.length ; i++){
            System.out.println("myArray[" + i + "] = " + myArray[i]);
        }

        var mc = new C1();
        mc.display();
    }
}
