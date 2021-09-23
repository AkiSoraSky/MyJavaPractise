package patterns;

import java.util.Scanner;

public class RightLeftLowerHalf {
    private static void showPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
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
n=  5
i = 0, sp= 0 => ***** j=5
i = 1, sp= 1 => ****  j=4
i = 2, sp= 2 => ***   j=3
i = 3, sp= 3 => **    j=2
i = 4, sp= 4 => *     j=1
 */
