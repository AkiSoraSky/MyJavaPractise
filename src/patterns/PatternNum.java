package patterns;

public class PatternNum {
    public static void pattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
