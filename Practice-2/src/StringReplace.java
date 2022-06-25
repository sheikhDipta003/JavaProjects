public class StringReplace {
    public static void main(String[] args) {
        String org = "This is a test. This is, too";
        String search = "is";
        String sub = "was";
        String result = "";
        int i;

        do{
            System.out.println(org);

            i = org.indexOf(search);
            if(i != -1){
                result = org.substring(0, i);                   //"This "
                result += sub;                                  //"This was"
                result += org.substring(i + search.length());   //"This was a test. This is, too"
                org = result;                                   //"This was a test. This is, too"
            }
        }while (i != -1);
    }
}
