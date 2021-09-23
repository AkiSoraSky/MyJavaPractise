package extraJava;

public class ReverseOfNum {
    private static int revNum(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int result = revNum(8454544);
        System.out.println("Reverse of number is: " + result);
    }
}
