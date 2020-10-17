import java.util.*;

public class searching {
    public static void main(String[] args) {

    }

    public static boolean linear_search(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele)
                return true;
        }
        return false;
    }

    public static int linear_search_02(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele)
                return i;
        }
        return -1;
    }

    public static boolean binarysearch(int[] arr, int ele) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == ele)
                return true;
            else if (arr[mid] < ele)
                low = mid + 1;
            else
                high = mid - 1;

        }
        return false;
    }
}