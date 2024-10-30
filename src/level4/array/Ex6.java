package level4.array;

public class Ex6 {

  public static void main(String[] args) {
    String s = "  Hello            World                  My   Name is  John  Doe";
    System.out.println(new Ex6().trimALl(s));
  }

  String trimALl(String s) {
    s = s.replaceAll("\\s+", " ");
    return s.trim();
  }
}
