package level1;

public class Ex19 {
    public static void main(String[] args) {
        Ex19 exercises = new Ex19();
        System.out.println(exercises.countWordsInAString("Hello my friend, how are you?"));

    }
    public int countWordsInAString(String str) {
        return str.split(" ").length;
    }
}
