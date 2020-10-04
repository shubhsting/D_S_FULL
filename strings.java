import java.util.*;

public class strings {
    public static void main(String[] args) {
        // String str=""
        // int a = 5;
        // String shubham = "dgyucfgeu167862878\7iuuh!@#$";
        // char ch = shubham.charAt(8);
        // System.out.println(ch);

        // Scanner scn=new Scanner(System.in);
        // // int num=scn.nextInt();
        // String str=scn.next();
        // System.out.println(str);
    }

    public static String reverseString(String str) {
        String revans = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            revans = revans + ch;
        }
        return revans;
    }
    
    
    
}
