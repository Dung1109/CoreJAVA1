package level1;

public class Ex16 {

    public void sortList(int a[]) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("The list of numbers in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 2, 8, 7, 1};
        Ex16 exercises = new Ex16();
        exercises.sortList(a);
    }
}
