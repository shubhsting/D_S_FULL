import java.util.*;

public class classesandfunctions {

    public static void main(String[] args) {
        // object
        first monitor = new first();
        monitor.top();

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

    }

    // hm jis bhi class ke name ka object likhenge uska contructor call ho
    // jayega(jiske ander full class ki information hai )
    // class
    // class class_name{}
    // function function_name(){}
    static class first { // {}

        // iss class ko call krne ke liye uper wali class ke ander object bnana jruri
        // hai uske bina nhi hoga use ye
        int a = 0;
        int b = 0;
        int c = 0;

        // function
        public void top() {
        }

        // constructor
        // constructor hmesha class ke ander hota hai aur iska name class name ke equal
        // hona chaiye
        first() {

        }
    }

    // static class Scanner {
    // public void nextInt() {
    // int num;
    // num scan krne ke liye ke lieyt
    // return num;
    // }
    // public void nexDouble(){

    // }
    // public void nextLong(){

    // }
    // Scanner(System.in){

    // }
    // }
}