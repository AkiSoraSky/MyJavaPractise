package recursionBasics;

import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        if (n==0)
            return 1;
        else
            return (n*fact(n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial:");
        int num = sc.nextInt();
        int ans = fact(num);
        System.out.println("Factorial: "+ans);
    }
}
