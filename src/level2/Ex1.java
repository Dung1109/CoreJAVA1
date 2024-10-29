package level2;

public class Ex1 {
    //find the second-largest number in an array.
    public static void main(String[] args) {
        int a[] = {70, 11, 20, 4, 100, 9};
        Ex1 ex1 = new Ex1();
        System.out.println(ex1.findSecondLargestNumber(a));
    }

    private int findSecondLargestNumber(int[] a) {
        int max = a[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
            }
        }
        return secondMax;
    }


}
