import java.util.Locale;

public class SomeStringMethods {
    public static void main(String[] args) {
        String s1 = "Good evening!";
        String s2 = new String("Good evening!");
        String s3 = s1;
        String s4 = "It is raining now..";
        String s5 = s1.toUpperCase(Locale.ROOT);
        String s6 = "";
        String s7 = "Apple, banana, orange, mango, strawberry, pomegranate";
        boolean b = true;
        char c = 'D';
        int n = 100;
        float f = -10.20F;
        double d = 25.55;
        long l = 123_456_789_000_123L;
        char[] value = {'H', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};

        System.out.println(s1.charAt(3));

        s1.getChars(0, 3+1, value, 0);
        System.out.println(value);

        if(s1.compareTo(s4) > 0){
            System.out.println("s1 comes after s4");
        }
        else if(s1.compareTo(s4) < 0){
            System.out.println("s4 comes after s1");
        }

        if(s1.compareTo(s3) == 0){
            System.out.println("s1 and s3 are the same");
        }

        if(s1.compareToIgnoreCase(s5) == 0){
            System.out.println("s1 and s2 are alphabetically the same");
        }

        System.out.println(s6.concat(s1));

        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));

        System.out.println(s4.endsWith("."));

        System.out.println(s1.indexOf('o'));
        System.out.println(s1.indexOf("Good"));
        System.out.println(s1.indexOf('o', 2));
        System.out.println(s1.indexOf("evening!", 5));

        System.out.println(s1.length());

        System.out.println(s1.regionMatches(false, 5, s2, 5, 8));

        System.out.println(s1.replace('o', 'u'));
        System.out.println(s1.replaceAll("evening!", "morning!"));

        String[] s8 = s7.split(",");
        for(var j = 0 ; j < s8.length ; j++){
            System.out.println(s8[j].strip());
        }

        System.out.println(s1.substring(5, 8+1));

        s1 = String.valueOf(b);
        s2 = String.valueOf(c);
        s3 = String.valueOf(n);
        s4 = String.valueOf(f);
        s5 = String.valueOf(d);
        s6 = String.valueOf(l);
        s7 = String.valueOf(value);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);

        //System.out.println("Four: " + 2 + 2);
        System.out.println("Four: " + (2 + 2));
        //Operator precedence causes the concatenation of
        //"Four: " with the string equivalent of 2 to take place first. This result is then concatenated with
        //the string equivalent of 2 a second time. To complete the integer addition first, you must use
        //parentheses.

        //bubble sort
        String[] arr = {"Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid", "of", "their", "country"};

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1; j < arr.length ; j++){
                if(arr[j].compareTo(arr[i]) < 0){
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        //joining two strings
        //"join()" is a static method defined in String class
        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);

        result = String.join(", ", "Summer", "Winter", "Rainy Season");
        System.out.println(result);
    }
}
