interface Callback{
    void call(int param);
}

class Client implements Callback{

    @Override
    public void call(int p) {
        System.out.println("Call method called with parameter-value: " + p);
    }

    public void f(){
        System.out.println("Simple method, not related with callback");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.call(25);
        client.f();

        //we cannot instantiate an interface
        Callback callback = new Client();   //but we can create reference of an interface
        //in that case, that reference variable will have access only to the overridden methods of the interface
        callback.call(45);
        //callback.f();     //no such method is known to callback

        Callback callback2 = new Callback() {
            @Override
            public void call(int param) {
                System.out.println("Anonymous class");
                System.out.println("Call method called with parameter-value: " + param);
            }

            public void sayHello(){
                System.out.println("Good evening!");
            }
        };
        //here, we are not actually instantiating an interface
        //callback2 is a reference variable. That means, it is now referring to an object
        //but that object is an instance of such a class that has no name and that implements the Callback interface
        //in order to implement an interface, all of its abstract methods must be implemented
        //that's exactly what is done here.
        callback2.call(30);
        //callback2.f();    //error
        //callback2.sayHello(); //error, why???
        //because the interface only has access to the overridden methods
    }
}
