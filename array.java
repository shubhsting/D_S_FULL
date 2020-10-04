import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int shubham=5;
        // System.out.println(shubham);
        // shubham=scn.nextInt();
        // int[] shubham = new int[5];
        // for (int i = 0; i < 5; i++) {
        // shubham[i] = scn.nextInt();
        // }

        // System.out.println("Stored array is printed below:");
        // for (int i = 0; i < 5; i++) {
        // System.out.println(shubham[i]);
        // }

        // String name="shubham";
        String[] name = new String[3];
        for (int i = 0; i < 3; i++)
            name[i] = scn.next();
        System.out.println("Stored array is printed below:");
        for (int i = 0; i < 3; i++)
            System.out.println(name[i]);
    }

    // name =["shubham","kajal","abc","xyz"]
    // for second element
    // name[1]=kajal
    // name[0]=shubham
    // name[3]=xyz

    // 1)create a array and take integer input print array
    // 2)create a string arr and take string input and print it
    // 3)find an element in both arrs created in integer and string
    // 4)find sum of all elements in array
    // 5)find size of array

}
