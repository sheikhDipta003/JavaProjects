package return_cap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public Client() throws Exception{
        Socket socket = new Socket("localhost", 80);
        System.out.println("Successful connection to the server.");
        System.out.println("To quit, type 'EXIT' ");

        // I/O
        BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        // Create a Scanner() object to accept input from keyboard
        Scanner keyboard = new Scanner(System.in);
        String message;

        do{
            message = keyboard.nextLine();
            out_socket.print(message);
            message = in_socket.readLine();
            System.out.println("Result: " + message);

        }while(!message.contains("EXIT"));

        socket.close();
        System.out.println("Socket is closed.");
    }

    public static void main(String[] args) {
        try{
            new Client();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}