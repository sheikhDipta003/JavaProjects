import java.util.StringTokenizer;

public class StringTokenizerTest {

    public static void main(String[] args) {
        String s1 = "What's your news?";
        StringTokenizer tokenizer = new StringTokenizer(s1); // by default, space(" ") is the token
        System.out.println("Total number of tokens: " + tokenizer.countTokens());
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }

        System.out.println("\n============================================");
        String s2 = "What's,your, ,news?";
        tokenizer = new StringTokenizer(s2, ",");   // here, comma(,) is the token
        System.out.println("Total number of tokens: " + tokenizer.countTokens());
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
    }
}
