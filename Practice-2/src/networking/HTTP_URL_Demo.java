package networking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HTTP_URL_Demo {
    public static void main(String[] args) throws IOException {
        URL http = new URL("http://www.google.com");
        HttpURLConnection httpConnect = (HttpURLConnection) http.openConnection();

        //display request method
        System.out.println("Request method: " + httpConnect.getRequestMethod());
        //display response code
        System.out.println("Response code: " + httpConnect.getResponseCode());
        //display response message
        System.out.println("Response message: " + httpConnect.getResponseMessage());
        //get a list of the header fields and a set of the header keys
        Map<String, List<String>> headerMap = httpConnect.getHeaderFields();
        Set<String> keySet = headerMap.keySet();
        System.out.println("\nHere are the headers: ");
        for(String s : keySet){
            System.out.println("Key: " + s + ", value: " + headerMap.get(s));
        }
    }
}
