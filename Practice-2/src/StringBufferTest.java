public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Testing");
        System.out.println(sb.capacity());  // string length(= 7) + default capacity(= 16)
        System.out.println(sb.charAt(0));
        sb.append(" ");
        sb.append("1, 2, 3");
        System.out.println(sb);
        sb.insert(15, " ..");
        System.out.println(sb);
        sb.replace(0, 6+1, "Running");
        System.out.println(sb);
        sb.delete(7, 8 + 1);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setLength(10);
        System.out.println("sb = " + sb + "; length = " + sb.length());

        StringBuffer sb_2 = new StringBuffer("Hello");
        System.out.println("Before, sb_2 = " + sb_2);
        System.out.println("Before, charAt(1) = " + sb_2.charAt(1));
        sb_2.setCharAt(1, 'i');
        sb_2.setLength(2);
        System.out.println("After, sb_2 = " + sb_2);
        System.out.println("After, charAt(1) = " + sb_2.charAt(1));

        StringBuffer sb_3 = new StringBuffer(40);
        String s;
        int a = 100;
        s = sb_3.append("a = ").append(a).append("!").toString();
        //This line is giving error if toString() is not called, why??
        System.out.println(s);
    }
}
