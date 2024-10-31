package level5;

public class Ex1 {
    public static void main(String[] args) {
        String s = "techlead";
        Ex1 exercises = new Ex1();
        System.out.println(exercises.reverseString(s));
    }

    public String reverseString(String s){
        String result = "";
        for(char c : s.toCharArray()){
            result = c + result;
        }
        return result;
    }
}
