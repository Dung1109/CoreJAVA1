package level1;

public class Ex110 {
    //Write a program that takes a list of strings as input and returns the number of strings that contain the letter 'a'

    public static void main(String[] args) {
        String a[] = {"Java", "Python", "C++", "Ruby", "Javascript"};
        Ex110 exercises = new Ex110();
        System.out.println(exercises.countStringContainLetterA(a));

    }
    public int countStringContainLetterA(String s[]){
        int count = 0;
        for(String a : s){
            if(a.contains("a")){
                count++;
            }
        }
        return count;
    }


}
