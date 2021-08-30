package recursionBasics;

import java.util.Scanner;

public class TheDistance {
    static void takeAStep(int i,int distance){
        if(i < distance) {
            i++;
            System.out.println("You take a Step: "+i+ " meters/s");
            takeAStep(i,distance);
        }
        else{
            System.out.println("You are done walking");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Far you want to walk (in meters) ?");
        int distance = sc.nextInt();

        takeAStep(0,distance);
    }
}
