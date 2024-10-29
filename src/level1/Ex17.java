package level1;

public class Ex17 {
    public static void main(String[] args) {
        String a[] = {"Java", "Python", "C++", "Ruby", "Javascript"};
        Ex17 exercises = new Ex17();
        exercises.sortList(a);
    }
    public void sortList(String a[]) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j].compareTo(a[j+1]) > 0) {
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("The list of strings in alphabetical order:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
