package level3;

public class Ex3 {

public static int[] findLongestIncreasingSubsequence(int a[]) {
        int max = 1;
        int current = 1;
        int end = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                current++;
            } else {
                if (current > max) {
                    max = current;
                    end = i - 1;
                }
                current = 1;
            }
        }
        if (current > max) {
            max = current;
            end = a.length - 1;
        }
        int result[] = new int[max];
        for (int i = 0; i < max; i++) {
            result[i] = a[end - max + 1 + i];
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = {4, 5, 1, 2, 3, 6, 7, 9, 10, 8};
        int result[] = findLongestIncreasingSubsequence(a);
        System.out.print("The longest increasing subsequence is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        System.out.println("The size of the longest increasing subsequence is: " + result.length);
    }
}
