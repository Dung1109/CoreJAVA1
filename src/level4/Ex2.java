package level4;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    //Write a program that takes a list of integers as input and returns the number of distinct subsequences of the list that sum up to a target value.

    public static void main(String[] args) {
        int a[] = {1,1,2,3,4};
        int target = 5;
        Ex2 exercises = new Ex2();
        System.out.println(calculateSubarraySums(a));
        System.out.println("The number of distinct subsequences of the list that sum up to the target value is: " + exercises.numberOfDistinctSubsequences(a, target));

    }

    private int numberOfDistinctSubsequences(int[] a, int target) {
        int count = 0;
        List<Integer> sums = calculateSubarraySums(a);
        for(int result : sums){
            if(result== target){
                count++;
            }
        }
        return count;

    }


    public static List<Integer> calculateSubarraySums(int[] arr) {
        List<Integer> sums = new ArrayList<>();
        sums.add(0);

        for (int num : arr) {
            int currentSize = sums.size();
            for (int i = 0; i < currentSize; i++) {
                sums.add(sums.get(i) + num);
            }
        }
        return sums;
    }
}
