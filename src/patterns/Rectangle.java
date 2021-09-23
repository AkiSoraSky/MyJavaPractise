package patterns;

import java.util.Scanner;

public class Rectangle {
    private static void showPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
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
//******
//******
//******
//******
//******
//******