package extraJava;

public class TcsAns {
    public static void main(String[] args) {
        int[] arr = new int[] {1,465,0,35,0,6,0,78,6,0};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        for(int list: arr) {
            System.out.print(list+" ");
        }
    }
}
