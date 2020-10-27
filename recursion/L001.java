import java.util.*;

public class L001 {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(greatest(arr, 0));
    }

    public static int greatest(int[] arr, int idx) {
        // base case
        if (idx == arr.length - 1)
            return arr[idx];

        // subproblem
        int subprob = greatest(arr, idx + 1);
        return Math.max(subprob, arr[idx]);
    }

    public static int power(int num, int po) {
        if (po == 1)
            return num;
        // subprob
        int subprob = power(num, po - 1);
        return subprob * num;

    }

    public static int smallest(int[] arr, int idx) {
        // base case
        if (idx == arr.length - 1)
            return arr[idx];

        // subproblem
        int subprob = smallest(arr, idx + 1);
        return Math.min(subprob, arr[idx]);
    }

    public static int fibonacci(int num) {
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;
        // if(num<=1) return num;

        // subproblem1
        int last = fibonacci(num - 1);
        // subproblem2
        int secondlast = fibonacci(num - 2);
        return last + secondlast;
    }

    public static boolean find(int[] arr, int idx, int num) {

        if (idx == arr.length)
            return false;
        boolean subprob = find(arr, idx + 1, num);
        if (subprob == true)
            return true;
        if (arr[idx] == num)
            return true;
        return false;
    }

}