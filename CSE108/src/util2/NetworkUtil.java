package util2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class NetworkUtil {
    private Socket socket;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;

    public NetworkUtil(String serverAddress, int port) throws IOException {
        this.socket = new Socket(serverAddress, port);
        oos = new ObjectOutputStream(socket.getOutputStream());
        ois = new ObjectInputStream(socket.getInputStream());
    }

    public NetworkUtil(Socket socket) throws IOException {
        this.socket = socket;
        oos = new ObjectOutputStream(socket.getOutputStream());
        ois = new ObjectInputStream(socket.getInputStream());
    }

    public Object read() throws IOException, ClassNotFoundException {
        return ois.readUnshared();
    }

    public void write(Object obj) throws IOException {
        oos.writeUnshared(obj);
    }

    public void closeConnection() throws IOException {
        ois.close();
        oos.close();
    }
}
