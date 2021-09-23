package extraJava;

public class FreqInNumber {
    public static void numFreq(int num, int i){
        int count=0;
        while(num>0) {
            int rem = num % 10;
            if (rem == i) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        numFreq(1000143250,8);
    }
}
