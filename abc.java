
import java.util.*;

public class abc {
    // angular brackets
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // ctrl+ /
        // System.out.println(reverseNumber(57376));
        // int reversednumber = reverseNumber(7687686);
        // System.out.println(reversednumber);
        // boolean result = isPrime(12);
        // System.out.println(result);

        // int shubham = gcd(12, 23);
        // System.out.println(shubham);
        // pattern1(7);
        // pattern_L(8);
        pattern_J(5);
    }

    public static int reverseNumber(int num) {
        int ans = 0;
        while (num != 0) {
            int lastnum = num % 10;
            ans = ans * 10 + lastnum;
            num = num / 10;
        }
        return ans;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int rem = a % b;
            b = a;
            a = rem;
        }
        return b;
    }

    // HCF*LCM=num1*num2;
    public static int lcm(int num1, int num2) {
        int HCF = gcd(num1, num2);
        int LCM = (num1 * num2) / HCF;
        return LCM;
    }

    public static void pattern(int n) {
        char k = 'A';
        for (int row = 1; row <= n; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    // pattern
    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row = n; row >= 1; row--) {
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_A(int n) {
        for (int row = 1; row <= n; row++) {
            for (int stars = 1; stars <= n; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_B(int n) {
        for (int row = 1; row <= n; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_C(int n) {
        for (int row = 1; row <= n; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    public static void pattern_D(int n) {
        int k = 1;
        for (int row = 1; row <= n; row++) {
            for (int stars = 1; stars <= row; stars++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
            k = 1;
        }
    }

    public static void pattern_E(int n) {
        for (int row = 1; row <= n; row++) {
            for (int stars = 1; stars <= row; stars++) {
                System.out.print((row % 2) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern_F(int n) {
        for (int row = 1; row <= n; row++) {
            for (int stars = 1; stars <= row; stars++) {
                // int val = Math.abs((row % 2) - 1);
                if (row % 2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }

    public static void pattern_G(int n) {
        for (int row = 1; row <= n; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print((star % 2) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern_H(int n) {
        char k = 'A';
        for (int row = 1; row <= n; row++) {
            for (int stars = 1; stars <= row; stars++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();

        }
    }

    public static void pattern_I(int n) {
        char k = 'A';
        for (int row = 1; row <= n; row++) {
            k = 'A';
            for (int star = 1; star <= row; star++) {
                System.out.print(k + " ");
                k++;
            }
            // k='A';
            System.out.println();

        }
    }

    public static void pattern_J(int n) {
        char k = 'A';
        for (int row = 1; row <= n; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
            k -= row - 1;
        }
    }

    // vector<int> shubham;
    public static void patternK(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_L(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                int k = star % 3;
                if (k == 1)
                    System.out.print("* ");
                else if (k == 2)
                    System.out.print("# ");
                else
                    System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
