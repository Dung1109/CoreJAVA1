package level3;

public class Ex10 {
    public void sortList(String a[]) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j].length() > a[j+1].length()) {
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                } else
                if(a[j].length() == a[j+1].length()){
                    if(countDistinctChars(a[j+1]) > countDistinctChars(a[j])){
                        String temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;

                    }
                }
            }
        }
        System.out.println("The list of strings sorted by the number of distinct characters in each string:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int countDistinctChars(String a){

        String temp = "";
        for(char c : a.toCharArray()){
            if(!temp.contains(String.valueOf(c))){
                temp += c;
            }
        }
        return temp.length();
    }

    public static void main(String[] args) {
        String a[] = {"apple", "banana", "orange","abedoc", "kiwi", "strawberry"};
        Ex10 exercises = new Ex10();
        exercises.sortList(a);
    }


}
