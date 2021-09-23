package extraJava;

import java.util.Scanner;

public class Fibonacci {
    public static void fib(int end) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 0; i <= end - 2; i++) {
            int c = a + b;

            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of series: ");
        int num = sc.nextInt();
        fib(num);
    }
}
