package networking_practice;

import util2.NetworkUtil;
import java.io.IOException;

public class ReadClientServer implements Runnable{
    private Thread thread;
    private NetworkUtil networkUtil;

    ReadClientServer(NetworkUtil networkUtil){
        this.networkUtil = networkUtil;
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try{
            while (true){
                Object incomingData = networkUtil.read();
                if(incomingData instanceof Message){
                    Message message = (Message) incomingData;
                    System.out.println("From: " + message.getFrom() + ", Text: " + message.getText());
                }
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
