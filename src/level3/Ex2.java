package level3;

public class Ex2 {

    public static void main(String[] args) {
        int a[] = {70, 11, 20, 4, 100, 9};
        Ex2 ex2 = new Ex2();
        System.out.println(ex2.maxDifference(a));
    }
    public int maxDifference(int[] a) {
        int max = Math.abs((a[0] - a[1]));

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int diff = Math.abs(a[i] - a[j]);
                if (diff > max) {
                    max = diff;
                }
            }
        }
        return max;
    }
}
