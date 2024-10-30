package level4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void bubbleSort(int arr[]) {
        int temp;
        int i, j;

        for (i = 0; i < arr.length - 1; i++) {
            System.out.println("Step " + (i + 1));

            for (j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));

            }
            System.out.println(".......................");

        }
        System.out.println("Array after sorted: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {

            System.out.printf("Enter element %d : ", i);
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);
    }
}
