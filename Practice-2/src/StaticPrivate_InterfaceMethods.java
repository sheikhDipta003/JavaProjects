import java.util.Random;

interface SI{
    //Interface can contain static methods
    static int getInt(){
        Random random = new Random();
        return random.nextInt(10);
    }

    //Interface can contain private methods as well.
    //They can only be called by a default method or another private method of the same interface.
    private void login(String password){
        if(password.equals("123")){
            System.out.println("You are logged in successfully");
        } else{
            System.out.println("Wrong password, try again!");
        }
    }
}

class childSI implements SI{
    void showInt(){
        SI.getInt();
        //Implementing classes do not inherit static methods of an interface.
        //That's why, we have to invoke the static method using the name of the interface.
    }

    //login();  //Error, cannot access a private method outside the class/interface where it is defined.
    //SI.login();   //Error, even using the name of the container class/interface doesn't work!
}

public class StaticPrivate_InterfaceMethods {
    public static void main(String[] args) {
        System.out.println(SI.getInt());
    }
}
