package recursionBasics;

import java.util.Scanner;

public class Basic {
    static void hello(int i) {
        if (i > 0) {
            System.out.println("Hello there "+i);
            i--;
            hello(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        hello(n);
    }
}
