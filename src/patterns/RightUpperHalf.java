package patterns;

import java.util.Scanner;

public class RightUpperHalf {
    private static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static int userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int num = userInput();
        printPattern(num);
    }
}
/*

 *
 * *
 * * *
 * * * *
 * * * * *

 */