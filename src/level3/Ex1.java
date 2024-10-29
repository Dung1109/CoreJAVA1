package level3;

public class Ex1 {
    public static void main(String[] args) {
        int a[] = {70, 11, 20, 4, 100, 9};
        Ex1 ex1 = new Ex1();
        System.out.println(ex1.findSecondSmallestNumber(a));
    }

    private int findSecondSmallestNumber(int[] a) {
        int min = a[0];
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                secondMin = min;
                min = a[i];
            } else if (a[i] < secondMin && a[i] != min) {
                secondMin = a[i];
            }
        }
        return secondMin;
    }


}