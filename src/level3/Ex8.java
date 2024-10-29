package level3;

public class Ex8 {

    public int numberOfPairs(int a[], int target) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {2, 10, 6, 3, 4, 7, 9, 2, 7,6};
        int target = 10;
        Ex8 exercises = new Ex8();
        System.out.println("The number of distinct pairs of numbers in the list that sum up to the target value is: " + exercises.numberOfPairs(a, target));
    }
}
