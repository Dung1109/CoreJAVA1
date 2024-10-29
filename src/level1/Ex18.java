package level1;

public class Ex18 {
    public static void main(String[] args) {
        double a[] = {1, 7 , 9, 10, 12, 3, 4, 5};
        Ex18 exercises = new Ex18();
        System.out.println("The median of the list is: " + exercises.findMedian(a));
    }
    public double findMedian(double a[]) {
        Ex18 exercises = new Ex18();
        a = exercises.sortList(a);
        int n = a.length;
        if (n % 2 == 0) {
            return (a[n / 2 - 1] + a[n / 2]) / 2.0;
        } else {
            return a[n / 2];
        }
    }

    public double[] sortList(double a[]) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    double temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;

    }
}
