package patterns;

import java.util.Scanner;

public class RightFromRight {
    private static void showPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <i ; sp++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static int rowsInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int num = rowsInput();
        showPattern(num);
    }
}
/*

 * * * * *
   * * * *
     * * *
       * *
         *

 */
