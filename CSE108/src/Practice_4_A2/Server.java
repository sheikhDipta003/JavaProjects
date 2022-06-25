package Practice_4_A2;

import util2.NetworkUtil;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
    private ServerSocket serverSocket;
    private static HashMap<String, NetworkUtil> clientMap;
    Server(){
        clientMap = new HashMap<>();
        try {
            serverSocket = new ServerSocket(33333);
            while (true){
                System.out.println("Waiting for connection ...");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connected!");
                serve(clientSocket);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Server();
    }

    private void serve(Socket clientSocket) throws IOException, ClassNotFoundException {
        NetworkUtil networkUtil = new NetworkUtil(clientSocket);
        String clientName = (String) networkUtil.read();
        System.out.println("New client " + clientName + " has joined.");
        clientMap.put(clientName, networkUtil);
        new ReadThreadServer(clientMap, networkUtil);
    }

    public static HashMap<String, NetworkUtil> getClientMap() {
        return clientMap;
    }

    public static void showAllClients(){
        HashMap<String, NetworkUtil> clientMap = getClientMap();
        System.out.println("clientMap is empty: " + clientMap.isEmpty());
        String[] clientNames = (String[]) clientMap.keySet().toArray();
        System.out.println("Names of all the clients currently connected: ");
        for(String client : clientNames){
            System.out.println(client);
        }
    }
}
