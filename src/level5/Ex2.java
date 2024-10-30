package level5;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public List<List<Integer>> splitArray(int[] arr, int n){
        if (n <= 0) {
            throw new IllegalArgumentException("Number of each part must be greater than zero");
        }

        List<List<Integer>> result = new ArrayList<>();
        int numParts = arr.length / n;
        int remainder = arr.length - n*numParts;
        int start = 0;

        for (int i = 0; i <= numParts; i++) {
            int end = start + (n < (arr.length-n*i) ? n : remainder);
            List<Integer> part = new ArrayList<>();
            for (int j = start; j < end; j++) {
                part.add(arr[j]);
            }
            result.add(part);
            start = end;
        }

        return result;


    }

    public static void main(String[] args) {
        Ex2 exercises = new Ex2();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 5;
        System.out.println(exercises.splitArray(arr, n));
    }
}
