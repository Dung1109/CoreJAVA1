package level4.array;

import java.util.*;


public class Ex4 {

  public static void main(String[] args) {
    List<Map<String, Integer>> list = new ArrayList<>();
    Map<String, Integer> obj1 = new HashMap<>();
    obj1.put("x", 1);
    obj1.put("y", 2);
    Map<String, Integer> obj2 = new HashMap<>();
    obj2.put("x", 2);
    obj2.put("y", 1);
    Map<String, Integer> obj3 = new HashMap<>();
    obj3.put("y", 2);
    obj3.put("x", 1);

    list.add(obj1);
    list.add(obj2);
    list.add(obj3);

    List<Map<String, Integer>> uniqueList = uniqArrayObject(list);
    System.out.println(uniqueList);
  }

  public static List<Map<String, Integer>> uniqArrayObject(List<Map<String, Integer>> list) {
    Set<String> seen = new HashSet<>();
    List<Map<String, Integer>> result = new ArrayList<>();

    for (Map<String, Integer> map : list) {
      String mapString = map.toString();
      if (!seen.contains(mapString)) {
        seen.add(mapString);
        result.add(map);
      }
    }

    return result;
  }
}


