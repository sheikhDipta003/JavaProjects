package networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL url = new URL("http://www.internic.net");
        URLConnection urlConnect = url.openConnection();

        //get header field
        System.out.println("First Header Field: " + urlConnect.getHeaderField(0));

        //get date
        long d = urlConnect.getDate();
        if(d == 0){
            System.out.println("No date information.");
        } else {
            System.out.println("Date: " + new Date(d));
        }

        //get content-type
        System.out.println("Content-type: " + urlConnect.getContentType());

        //get expiration date
        d = urlConnect.getExpiration();
        if(d == 0){
            System.out.println("No date information.");
        } else {
            System.out.println("Expiration Date: " + new Date(d));
        }

        //get the date of last-modification
        d = urlConnect.getLastModified();
        if(d == 0){
            System.out.println("No date information.");
        } else {
            System.out.println("Date of last modification: " + new Date(d));
        }

        long len = urlConnect.getContentLengthLong();
        if(len == -1){
            System.out.println("Content length unavailable.");
        } else {
            System.out.println("Content length = " + len);
        }

        if(len != 0){
            System.out.println("====================== Content ======================");
            InputStream in = urlConnect.getInputStream();
            while((c = in.read()) != -1){
                System.out.print((char) c);
            }
            in.close();
        } else {
            System.out.println("No content available.");
        }
    }
}
