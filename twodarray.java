
import java.util.*;

class twodarray {
    public static void main(String[] args) {
        StringBuilder sb_name = new StringBuilder();
        sb_name.append("shubham");// shallow copy
        String str = "shubham ";
        str = str + "singh";// deep copy
    }

    public static void horizontalprint(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
        }
    }

    public static void verticalprint(int[][] arr) {
        for (int col = 0; col < arr.length; col++) {
            for (int row = 0; row < arr.length; row++) {
                System.out.print(arr[row][col] + " ");
            }
        }
    }

    public static void spiralprint(int[][] arr) {
        // radius ka loop row/2
        // first row 1 se <arr[row]-1
        // last col 0 se <arr.length
        // last row arr[row]-2 se 1 tak
        // first col arr.length-1 se 0 tak

        ArrayList<Integer> list = new ArrayList<>();
        int[] arr_ = new int[5];

    }

}