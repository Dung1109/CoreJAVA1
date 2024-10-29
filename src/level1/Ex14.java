package level1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the list:" );
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the number " + (i+1) + ":");
            a[i] = scanner.nextInt();
        }
        Ex14 exercises = new Ex14();
        exercises.showLargestNumber(a);

    }
    public void showLargestNumber(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("The largest number is: " + max);
    }
}
