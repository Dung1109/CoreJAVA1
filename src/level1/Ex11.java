package level1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 digits:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("The sum of 2 digits " + a + " and " + b + " is " + (a + b));
    }
}
