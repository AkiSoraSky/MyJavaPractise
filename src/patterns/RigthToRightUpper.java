package patterns;

import java.util.Scanner;

public class RigthToRightUpper {
    private static void showPattern(int n) {
        for (int i = 1; i <=n; i++) {
            for (int sp = n-i-1; sp>=0; sp--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
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
n=5
    *
   **
  ***
 ****
*****

i = 1, sp =4, j= 1
i = 2, sp =3, j= 2
i = 3, sp =2, j= 3
i = 4, sp =1, j= 4
i = 5, sp =0, j= 5
 */
