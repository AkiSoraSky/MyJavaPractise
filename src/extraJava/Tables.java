package extraJava;

public class Tables {
    private static void tables() {
        for (int i = 2; i <= 20; i++) {
            System.out.print(i+ " :");
            for (int j = 1; j <= 10; j++) {
                System.out.print(" "+i*j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        tables();
    }
}
