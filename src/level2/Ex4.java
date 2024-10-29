package level2;

public class Ex4 {
    public static int findSumsOfNumbersDividedBy3And5(int array[] ){

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] % 5 == 0) {
                sum += array[i];
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int array[] = {3, 5, 15, 20, 9, 10, 12, 18};
        System.out.println(findSumsOfNumbersDividedBy3And5(array));
    }
}
