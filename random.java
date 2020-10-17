import java.lang.reflect.Array;
import java.util.*;

public class random {
    public static void main(String[] args) {
        System.out.println(reverse("12345"));
    }

    public static String reverse(String str) {

        char[] arr = str.toCharArray();
        Collections.reverse(Arrays.asList(arr));
        return String.valueOf(arr);
    }
    public static void cric(String str){

    }
}
