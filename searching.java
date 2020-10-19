import java.util.*;

public class searching {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 4, 3 };
        insertion_sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
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

    // sorting
    // selection sort

    public static void selection_sort(int[] arr) {
        // window ka size window ki value se last tak hai
        for (int window = 0; window < arr.length; window++) {
            int windomin = Integer.MAX_VALUE;
            int minidx = 0;
            for (int idx = window; idx < arr.length; idx++) {
                if (arr[idx] < windomin) {
                    windomin = arr[idx];
                    minidx = idx;
                }
            }
            // swap
            arr[minidx] = arr[window];
            arr[window] = windomin;
        }
    }

    public static void insertion_sort(int[] arr) {
        // window ka size 0 se window ki value tak hai
        for (int window = 0; window < arr.length; window++) {
            for (int idx = window - 1; idx >= 0; idx--) {
                if (arr[idx] > arr[window]) {
                    // swap
                    int temp = arr[idx];
                    arr[idx] = arr[window];
                    arr[window] = temp;
                } else
                    break;
            }
        }
    }
}