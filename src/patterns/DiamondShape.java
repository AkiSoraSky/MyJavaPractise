package patterns;

import java.util.Scanner;

public class DiamondShape {
    private static void showPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int col = i < n ? n - i - 2: (n+1)-i;
            for (int sp = col; sp >= 0; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j+=2) {
                System.out.print("*");
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
  *
 ***
*****
 ***
  *
 */