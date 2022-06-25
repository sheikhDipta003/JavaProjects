package networking_practice;

import util2.NetworkUtil;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
    private ServerSocket serverSocket;
    private String clientCredentials;
    private String name;
    private String password;
    private static HashMap<String, NetworkUtil> clientMap;

    Server(){
        try {
            clientMap = new HashMap<>();
            serverSocket = new ServerSocket(33333);
            while (true){
                System.out.println("Waiting for connection ... ");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connected");
                serve(clientSocket);
                //serve(clientSocket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server();
    }

    public void loginClient(Socket clientSocket, String[] clientInfo, NetworkUtil networkUtil) {
        try {
            if(clientInfo[0].equals(name) && clientInfo[1].equals(password)){
                networkUtil.write("You are logged in successfully.");
            } else {
                networkUtil.write("Login failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void registerClient(String[] clientInfo, NetworkUtil networkUtil) {
        try {
            clientCredentials = clientInfo[0] + "," + clientInfo[1];
            clientMap.put(clientCredentials, networkUtil);
            name = clientInfo[0];
            password = clientInfo[1];
            System.out.println("New client has registered::\nName: " + name + ", Password: " + password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void serve(Socket clientSocket){
        try {
            int i = 0;
            NetworkUtil networkUtil = new NetworkUtil(clientSocket);
            do {
                String[] clientInfo = ((String) networkUtil.read()).split(",");
                if (Boolean.parseBoolean(clientInfo[2])) {
                    loginClient(clientSocket, clientInfo, networkUtil);
                } else if (!Boolean.parseBoolean(clientInfo[2])) {
                    registerClient(clientInfo, networkUtil);
                }
                i++;
            }while (i < 2);
            new ReadThreadServer(clientMap, networkUtil);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, NetworkUtil> getClientMap() {
        System.out.println(clientMap);
        return clientMap;
    }

    public static void showAllClients(){
        HashMap<String, NetworkUtil> clientMap = getClientMap();
        //System.out.println("clientMap is empty: " + clientMap.isEmpty());
        String[] clientNames = (String[]) clientMap.keySet().toArray();
        System.out.println("Names of all the clients currently connected: ");
        for(String client : clientNames){
            System.out.println(client);
        }
    }
}
