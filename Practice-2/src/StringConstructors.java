import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringConstructors {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {(byte)'a', (byte)'b', (byte)'c', (byte)'d', (byte)'e', (byte)'f', (byte)'g', (byte)'h', (byte)'i', (byte)'j'};
        char[] value = {'H', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
        byte[] bytes_2 = {65, 66, 67, 68, 69, 70};

        String s1 = new String();   //Initializes a newly created String object so that it represents an empty character sequence.
        s1 = "Intellij is not so intelligent";
        String s2 = new String(bytes);
        String s3 = new String(bytes, 0, 5);
        String s4 = new String(bytes, 5, 5, "UTF-8");
        String s5 = new String(bytes, 2, 4, StandardCharsets.UTF_8);
        String s6 = new String(bytes, "UTF-8");
        String s7 = new String(bytes, StandardCharsets.UTF_8);
        String s8 = new String(value, 0, 5);
        String s9 = new String(s8);
        String s10 = "Good evening";
        String s11 = "Good" + " evening";
        String s12 = new String(bytes_2, 0, 3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);
        System.out.println(s10);
        System.out.println(s11);
        System.out.println(s12);    //The byte-to-character conversion is done by using the default character encoding of the platform.[H. Schildt]
    }
}
