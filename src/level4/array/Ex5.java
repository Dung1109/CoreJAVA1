package level4.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ex5 {

  public static List<Map<String, Integer>> groupByArrayObject(List<Map<String, Integer>> list, String key) {
    List<Map<String, Integer>> result = new ArrayList<>();
    for(Map<String, Integer> map : list){
      if(map.containsKey(key)){
        result.add(map);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    List<Map<String, Integer>> list = new ArrayList<>();
    Map<String, Integer> obj1 = Map.of("x", 1, "t", 2);
    Map<String, Integer> obj2 = Map.of("x", 2, "y", 1);
    Map<String, Integer> obj3 = Map.of("y", 2, "z", 1);
    Map<String, Integer> obj4 = Map.of("x", 1, "t", 2);

    list.add(obj1);
    list.add(obj2);
    list.add(obj3);
    list.add(obj4);

    List<Map<String, Integer>> result = groupByArrayObject(list, "x");
    System.out.println(result);
  }
}
