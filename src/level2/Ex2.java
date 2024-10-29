package level2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        String str[] = {"ac", "abc", "abcd", "abcde", "abcdef"};
        Ex2 exercises = new Ex2();
        System.out.println("The largest string is: " + exercises.showLargestString(str));

    }

    public String showLargestString(String str[]) {
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() > largest.length()) {
                largest = str[i];
            }
        }
        return largest;
    }
}
