package level4;

public class Ex9 {
    //return the longest subsequence numbers of 1 list satisfying number in the next - number current = 1
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 8, 3, 2, 4, 5, 6, 7, 8, 9};
        Ex9 exercises = new Ex9();
        System.out.println(exercises.longestSubsequence(a));
    }

    public int longestSubsequence(int[] a) {
        int count = 1;
        int max = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] - a[i - 1] == 1) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}