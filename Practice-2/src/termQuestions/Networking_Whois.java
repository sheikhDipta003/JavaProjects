package termQuestions;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Networking_Whois {
    public static void main(String[] args) throws IOException {
        int dataFromInterNIC;
        Socket s = new Socket("whois.internic.net", 43);
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();

        //create the string to send to the interNIC server
        String buffer = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
        os.write(buffer.getBytes());
        while((dataFromInterNIC = is.read()) != -1){
            System.out.print((char)dataFromInterNIC);
        }

        s.close();
    }
}
