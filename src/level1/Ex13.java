package level1;

import java.util.Scanner;

public class Ex13 {
    public double calculateSquare(double a) {
        return Math.pow(a, 2);
    }

public static void main(String[] args) {
        Ex13 exercises = new Ex13();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        double a = scanner.nextDouble();
        System.out.println("The square of " + a + " is: " + exercises.calculateSquare(a));
    }
}
