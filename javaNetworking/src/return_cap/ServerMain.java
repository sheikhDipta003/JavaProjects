package return_cap;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

    private int clientNo = 1;

    public int getClientNo(){
        return clientNo++;
    }

    public ServerMain() throws Exception{
        ServerSocket server_socket = new ServerSocket(80);
        System.out.println("Port 2020 is now open");

        while(true){
            Socket socket = server_socket.accept();
            ServerThread server_thread = new ServerThread(socket, this);
            Thread thread = new Thread(server_thread);
            thread.start();
        }
    }

    public static void main(String[] args) {
        try{
            new ServerMain();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
