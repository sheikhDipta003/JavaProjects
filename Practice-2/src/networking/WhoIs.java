package networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WhoIs {
    public static void main(String[] args) throws IOException {
        int c;
        Socket s = new Socket("whois.internic.net", 43);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        String str = (args.length == 0 ? " MHProfessional.com": args[0]) + "\n";
        out.write(str.getBytes());
        while((c = in.read()) != -1){
            System.out.print((char) c);
        }
        s.close();
    }
}
