package level4.array;

public class Ex3 {
    public int[] arrayNotDuplicate(int[] arr){
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index++] = arr[i];
            }
        }
        int[] result2 = new int[index];
        for (int i = 0; i < index; i++) {
            result2[i] = result[i];
        }
        return result2;
    }

    public static void main(String[] args) {
        Ex3 exercises = new Ex3();
        int[] arr = {1, 2,6,9,10, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3};
        int[] result = exercises.arrayNotDuplicate(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
