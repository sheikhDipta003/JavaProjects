package simple_tcp_2;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public Server() throws Exception{
        ServerSocket server_socket = new ServerSocket(8080);    // opening a new port
        System.out.println("Port 8080 has been opened");

        Socket socket = server_socket.accept();
        System.out.println("Client: " + socket.getInetAddress() + " has connected");

        //I/O Buffers
        BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        int secret_number = (int)(Math.random() * 10 + 1);  //generate a random number in the range [1, 10]
        String message;

        do{
            out_socket.println("Guess a number: ");
            message = in_socket.readLine();
        }while(Integer.parseInt(message) != secret_number);

        out_socket.println("You got it!!");
        System.out.println("Secret number is out. Exiting the app..");

        socket.close();
        System.out.println("Socket is closed");
    }

    public static void main(String[] args) {
        try{
            new Server();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

