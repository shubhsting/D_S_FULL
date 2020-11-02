import java.util.*;

public class L001 {
    public static void main(String[] args) {
        int[] arr = {};
        int shubham = 0;

        int[] ar = new int[5];

        for (int i = 0; i < 5; i++)
            System.out.println(arr[i]);
        // enhanced loop
        for (int ele : ar)
            System.out.println(ele);

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

    // complexities
    // dry run
    public static ArrayList<String> all_subseq(String str) {
        if (str.length() == 0)
            return new ArrayList<>();
        ArrayList<String> myAns = new ArrayList<>();
        // subprob
        ArrayList<String> subprob = all_subseq(str.substring(1));
        char ch = str.charAt(0);
        // for(String st:str)
        for (int i = 0; i < subprob.size(); i++) {
            String st = subprob.get(i);
            myAns.add(st);
            myAns.add(ch + st);
        }
        return myAns;
    }

    public static void all_subseq_02(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        all_subseq_02(ques.substring(1), ans);
        all_subseq_02(ques.substring(1), ans + ch);
    }

}