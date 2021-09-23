package extraJava;

public class ArrayReverse {
    private static int[] rev(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{59, 5, 6, 7, 3, 654, 1};
        for (int j : rev(arr)) {
            System.out.print(j+" ");
        }
    }
}
