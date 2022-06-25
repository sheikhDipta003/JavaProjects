package networking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("getLocalHost(): " + address);
        System.out.println("getAddress(): " + Arrays.toString(address.getAddress()));
        System.out.println("getHostName(): " + address.getHostName());
        System.out.println("getHostAddress(): " + address.getHostAddress());

        address = InetAddress.getByName("www.google.com");
        System.out.println(address);

        InetAddress[] allAddresses = InetAddress.getAllByName("www.nba.com");
        for(InetAddress inetAddress: allAddresses){
            System.out.println(inetAddress);
        }
    }
}
