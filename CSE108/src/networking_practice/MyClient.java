package networking_practice;

import util2.NetworkUtil;

import java.util.Scanner;

public class MyClient {
    private static NetworkUtil networkUtil;
    private static String name;
    private static String password;

    MyClient(String serverAddress, int port){
        try {
            networkUtil = new NetworkUtil(serverAddress, port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hi, I am new client!");
        new MyClient("127.0.0.1", 33333);
        //1. Register
        //2. Login
        //3. GetList
        //4. SendOne
        //5. Broadcast
        //-1 --> break
        while (true) {
            System.out.println("1. Register\n2. Login\n3. GetList\n4. SendOne\n5. Broadcast");
            System.out.print("Choose a number: ");
            int userInput = Integer.parseInt(new Scanner(System.in).nextLine());
            if (userInput == 1) {
                register();
            } else if (userInput == 2) {
                login();
            } else if (userInput == 3) {
                Server.showAllClients();
            } else if (userInput == 4) {
                sendMessage();
            } else if (userInput == 5) {
                broadCast();
            } else if(userInput == -1){
                break;
            }
        }
    }

    public static void register() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();
        try {
            networkUtil.write(name + "," + password + "," + "false");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void login() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name to log in: ");
        name = input.nextLine();
        System.out.println("Enter your password to log in: ");
        password = input.nextLine();
        try {
            networkUtil.write(name + "," + password + "," + "true");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String feedback = (String) networkUtil.read();
            System.out.println("Server: " + feedback);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendMessage() {
        new WriteThreadClient(networkUtil, name);
        new ReadClientServer(networkUtil);
    }
    public static void broadCast() {

    }
}
