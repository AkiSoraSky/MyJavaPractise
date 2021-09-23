package patterns;

public class RightFull {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= (2 * n) - 1; i++) {
            int col = i < n ? i : n - (i - n);
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*

 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

 */