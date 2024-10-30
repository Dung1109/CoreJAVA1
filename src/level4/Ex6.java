package level4;

import java.util.HashSet;
import java.util.Set;

public class Ex6 {
    public static int findMaxProductOfThreeDistinct(int[] a) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : a) {
            uniqueNumbers.add(num);
        }

        int[] uniqueArray = uniqueNumbers.stream().mapToInt(Integer::intValue).toArray();

        if (uniqueArray.length < 3) {
            throw new IllegalArgumentException("Cannot find 3 distinct numbers in the list.");
        }

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : uniqueArray) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }

    public static void main(String[] args) {
        int a[] = {-10, -5, 0, 1, 2, 3, 4};
        System.out.println(findMaxProductOfThreeDistinct(a));
    }
}
