package simple_tcp_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public Client() throws Exception{
        Socket socket = new Socket("localhost", 8080);
        System.out.println("Successful connection to the server");

        // I/O
        BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        // Create a Scanner() object to accept input from keyboard
        Scanner keyboard = new Scanner(System.in);
        String client_number;

        while(in_socket.readLine().startsWith("Guess")){
            System.out.println("Server says, guess a number from 1 to 10: ");
            client_number = keyboard.nextLine();
            out_socket.println(client_number);
        }

        System.out.println("Server says, you got it!!");

        socket.close();
        System.out.println("Socket is closed");
    }

    public static void main(String[] args) {
        try{
            new Client();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
