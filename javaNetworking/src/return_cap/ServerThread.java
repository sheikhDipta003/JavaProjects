package return_cap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable{

    private Socket socket;
    private ServerMain server_main;

    public ServerThread(Socket socket, ServerMain server_main) {
        this.socket = socket;
        this.server_main = server_main;
    }

    public void run(){
        try{
            int clientNo = server_main.getClientNo();
            System.out.println("Client " + clientNo + " has connected");

            BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

            do{
                String from_client = in_socket.readLine();

                if(!from_client.equals("EXIT")){
                    out_socket.print(from_client.toUpperCase());
                }
                else{
                    break;
                }
            }while(true);

            socket.close();
            System.out.println("Client " + clientNo + " has disconnected");

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
