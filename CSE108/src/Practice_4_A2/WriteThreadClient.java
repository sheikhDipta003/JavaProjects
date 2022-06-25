package Practice_4_A2;

import util2.NetworkUtil;

import java.io.IOException;
import java.util.Scanner;

public class WriteThreadClient implements Runnable{
    private NetworkUtil networkUtil;
    private Thread thread;
    private String name;

    WriteThreadClient(NetworkUtil networkUtil, String name){
        this.name = name;
        this.networkUtil = networkUtil;
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try{
            while (true){
                Scanner input = new Scanner(System.in);
                String From = name;
                System.out.println("Enter name of the client to send message: ");
                String To = input.nextLine();
                System.out.println("Enter the message: ");
                String Text = input.nextLine();
                Message message = new Message(To, From, Text);
                networkUtil.write(message);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {
                networkUtil.closeConnection();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
