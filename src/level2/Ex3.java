package level2;

public class Ex3 {
    public String findTheLongestCommonOfTwoStrings(String str1, String str2) {
        String longestCommon = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String sub = str1.substring(i, j);
                if (str2.contains(sub) && sub.length() > longestCommon.length()) {
                    longestCommon = sub;
                }
            }
        }
        return longestCommon;
    }

    public static void main(String[] args) {
        String s1 = "Java is a programming language";
        String s2 = "HTML/CSS is not a programming language";
        Ex3 exercises = new Ex3();
        System.out.println("The longest common substring is: " + exercises.findTheLongestCommonOfTwoStrings(s1, s2));
    }
}
