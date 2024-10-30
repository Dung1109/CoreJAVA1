package level4;

public class Ex10 {
    public String[] findMaxCommonCharacters(String[] str, int n) {
        String[] s1 = new String[2];

        String maxCommonCharacters = "";
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                String commonCharacters = findCommonCharacters(str[i], str[j]);
                if (commonCharacters.length() > maxCommonCharacters.length()) {
                    maxCommonCharacters = commonCharacters;
                    s1[0] = str[i];
                    s1[1] = str[j];
                }
            }
        }
        if(maxCommonCharacters.length() < n){
            return null;
        } else {
            return s1;
        }
    }

    public String findCommonCharacters(String str1, String str2) {
        String commonCharacters = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str2.contains(String.valueOf(str1.charAt(i)))) {
                commonCharacters += str1.charAt(i);
            }
        }
        return commonCharacters;
    }

    public static void main(String[] args) {
        String [] str = {"aavJtcrip", "Python", "C++", "Ruby", "Javascript"};
        Ex10 exercises = new Ex10();
        int n = 20;
        String[] result = exercises.findMaxCommonCharacters(str, n);
        if(result == null){
            System.out.println("No strings have common characters more than " + n + " characters.");
        } else {
            for(String s: result){
                System.out.println(s);
            }
        }
    }
}
