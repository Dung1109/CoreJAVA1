package level3;


import java.util.Arrays;

public class Ex6 {
    //Write a program that takes two lists of integers as input and returns the median of the combined list.
public double medianOfTwoLists(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int c[] = new int[n+m];
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            c[n+i] = b[i];
        }
        Arrays.sort(c);
        int length = c.length;
        if (length % 2 == 0) {
            return (c[length/2] + c[length/2 - 1]) / 2.0;
        } else {
            return c[length/2];
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 10, 6, 3, 4,  7,9};
        int b[] = { 8, 14, 11};
        Ex6 exercises = new Ex6();
        System.out.println("The median of the combined list is: " + exercises.medianOfTwoLists(a, b));
    }

}
