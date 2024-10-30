package level4;

public class Ex7 {
    public String[] sortStringsByDistinctWords(String[] strings) {
        for(int i = 0; i < strings.length-1; i++) {
            for(int j = i+1 ; j < strings.length; j++) {
                if(countDistinctWords(strings[i]) < countDistinctWords(strings[j])) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                } else{
                   if(strings[i].compareTo(strings[j]) < 0) {
                       String temp = strings[i];
                       strings[i] = strings[j];
                       strings[j] = temp;
                   }
                }
            }
        }
        return strings;
    }

    public int countDistinctWords(String str) {
        return (int) str.chars().distinct().count();
    }

    public static void main(String[] args) {
        Ex7 exercises = new Ex7();
        String[] strings = {"the quick brown fox", "the lazy dog jumps over the fence", "the cat in the hat"};
        String[] sortedStrings = exercises.sortStringsByDistinctWords(strings);
        for(String str : sortedStrings) {
            System.out.println(str);
        }
    }
}
