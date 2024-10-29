package level3;

import java.util.Arrays;

public class Ex5 {
    public int smallestNumberNotEqualsSumOfAnyIntegersInArray(int a[]) {
            Arrays.sort(a);
            int smallestSum = 1;
            for (int num : a) {

                if (num > smallestSum) {
                    break;
                }
                smallestSum += num;
            }
            return smallestSum;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,8 };
        Ex5 exercises = new Ex5();
        System.out.println(exercises.smallestNumberNotEqualsSumOfAnyIntegersInArray(a));
    }
}
