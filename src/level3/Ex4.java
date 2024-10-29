package level3;

public class Ex4 {

    public static void main(String[] args) {
        Ex4 exercises = new Ex4();
        String[] str = {"aavJtcrip", "Python", "C++", "Ruby", "Javascript"};
        for(String s: exercises.findMaxCommonCharacters(str)){
            System.out.println(s);
        }
    }

    public String[] findMaxCommonCharacters(String[] str) {
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
        return s1;
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

}
