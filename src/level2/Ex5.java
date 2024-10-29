package level2;

public class Ex5 {
    //Write a program that takes a list of integers as input and returns the maximum sum of any contiguous subarray within the list.
    public static int findMaxSumOfContiguousSubarray(int a[]){
        int maxSum = a[0];
        int currentSum = a[0];
        for (int i = 1; i < a.length; i++) {
            currentSum = Math.max(a[i], currentSum + a[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a[] = {1, 9, 10, -77 , -12, 3, 4, 5};
        System.out.println(findMaxSumOfContiguousSubarray(a));
    }
}
