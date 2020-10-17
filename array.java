import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int shubham=5;
        // System.out.println(shubham);
        // shubham=scn.nextInt();
        int[] shubham = new int[5];
        for (int i = 0; i < 5; i++) {
            shubham[i] = scn.nextInt();
        }

        System.out.println("Stored array is printed below:");

        for (int i = 0; i < 5; i++) {
            System.out.println(shubham[i]);
        }

        // String name="shubham";
        String[] name = new String[3];
        for (int i = 0; i < 3; i++)
            name[i] = scn.next();
        System.out.println("Stored array is printed below:");
        for (int i = 0; i < 3; i++)
            System.out.println(name[i]);

        pattern_(5);
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

    public static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            if (row % 2 == 1) {

                for (int star = 0; star < row; star++)
                    System.out.print((char) (star + 'A') + " ");

            } else {

                for (int star = 0; star < row; star++)
                    System.out.print((char) ('Z' - star) + " ");
            }

            System.out.println();
        }
    }

    public static void pattern_(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++)
                System.out.print(" ");

            for (int star = 1; star <= row; star++) {
                if (star % 3 == 0) {
                    System.out.print("* ");
                } else if (star % 3 == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("@ ");
                }
            }
            System.out.println();
        }
        for (int row = n; row < 2 * n; row++) {
            // space pattern ulte wala
            // star pattern

        }
    }
}
