package extraJava;

import java.util.Scanner;

public class Hypotenuse {

    double x;
    double y;
    double z;

    public void userInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        scanner.close();
    }

    public static void main(String[] args) {
        Hypotenuse obj = new Hypotenuse();
        obj.userInput();
        System.out.println("The hypotenuse is : " +obj.z);
    }
}
