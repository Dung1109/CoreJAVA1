package level1;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of string:" );
        int n = scanner.nextInt();
        String str[] = new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the string " + (i+1) + ":");
            str[i] = scanner.next();
        }
        Ex15 exercises = new Ex15();
        System.out.println("The shortest string is: " + exercises.showShortestString(str));

    }

    public String showShortestString(String str[]) {
        String shortest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() < shortest.length()) {
                shortest = str[i];
            }
        }
        return shortest;
    }
}
