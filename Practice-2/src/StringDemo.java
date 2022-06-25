public class StringDemo {
    public static void main(String[] args) {
        String s1 = "The sun rises in the east";
        String s2 = "It is raining right now";
        String s3;

        s3 = s1;
        System.out.println("s1 = " + s1 + ", s3 = " + s3);
        s3 = s2;
        System.out.println("s2 = " + s2 + ", s3 = " + s3);
        //To say that the strings within objects of type String are unchangeable
        //means that the contents of the String instance cannot be changed after it has been created.
        //However, a variable declared as a String reference can be changed to point at some other
        //String object at any time. [H. Schildt]
    }
}
