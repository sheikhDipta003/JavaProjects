package Practice_4_A2;

import util2.NetworkUtil;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class Client {
    private static NetworkUtil networkUtil;
    private static String clientName;
    private Thread thread;

    Client(String serverAddress, int port){
        try {
            networkUtil = new NetworkUtil(serverAddress, port);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Client("127.0.0.1", 33333);
        //1. Connect
        //2. GetList
        //3. SendOne
        //4. Broadcast
        while (true){
            System.out.println("1. Connect");
            System.out.println("2. GetList");
            System.out.println("3. SendOne");
            System.out.println("4. Broadcast");
            System.out.print("Enter an integer between 1 and 4: ");
            int clientInput = Integer.parseInt(new Scanner(System.in).nextLine());
            if (clientInput == 1) {
                System.out.print("Enter your name: ");
                clientName = new Scanner(System.in).nextLine();
                Connect(networkUtil, clientName);
            } else if (clientInput == 2) {
                Server.showAllClients();
            } else if (clientInput == 3) {
                SendOne();
            } else if (clientInput == 4) {
                Broadcast();
            }
        }
    }

    private static void Connect(NetworkUtil networkUtil, String clientName) {
        try {
            networkUtil.write(clientName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void SendOne() {
        new WriteThreadClient(networkUtil, clientName);
        new ReadClientServer(networkUtil);
    }

    private static void Broadcast() {

    }
}
