package level4;

public class Ex3 {
    public int commonLongestSubStringInEachStringOfList(String a[]){
        int count = 0;
        String shortestString = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i].length() < shortestString.length()){
                shortestString = a[i];
            }
        }
        for(int i = 0; i < shortestString.length(); i++){
            for(int j = i+1; j <= shortestString.length(); j++){
                String subString = shortestString.substring(i, j);
                boolean isCommon = true;
                for(int k = 0; k < a.length; k++){
                    if(!a[k].contains(subString)){
                        isCommon = false;
                        break;
                    }
                }
                if(isCommon && subString.length() > count){
                    count = subString.length();
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String a[] = {"programming", "programmer", "program", "programmable", "programmatically", "programmatically"};
        Ex3 exercises = new Ex3();
        System.out.println("The length of the longest common substring in each string of the list is: " + exercises.commonLongestSubStringInEachStringOfList(a));
    }
}
