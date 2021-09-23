package extraJava;

public class Frequency {
    private static void freq(int n) {
        int count = 0;
        int [] series = {5,8,6,9,8,4,7,8,3};
        for (int j : series) {
            if (n == j) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        freq(2);
    }
}
