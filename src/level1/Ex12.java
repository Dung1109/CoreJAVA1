package level1;

import java.util.Scanner;

public class Ex12 {
    public int showLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        Ex12 exercises = new Ex12();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        System.out.println("The length of string is: " + exercises.showLength(str));
    }
}
