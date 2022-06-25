package networking_practice;

import util2.NetworkUtil;
import java.io.IOException;
import java.util.HashMap;

public class ReadThreadServer implements Runnable{
    private Thread thread;
    private NetworkUtil networkUtil;
    private HashMap<String, NetworkUtil> clientMap;

    ReadThreadServer(HashMap<String, NetworkUtil> clientMap, NetworkUtil networkUtil){
        this.clientMap = clientMap;
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
                    String To = message.getTo();
                    NetworkUtil networkUtil_To = clientMap.get(To);
                    if(networkUtil_To != null){
                        networkUtil_To.write(message);
                    }
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
