package level4.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ex7 {

  public static void main(String[] args) {
    List<Map<String, Integer>> listObjects = new ArrayList<>();

    Map<String, Integer> map1 = new HashMap<>();
    map1.put("b", 3);
    map1.put("a", 2);
    map1.put("c", 1);

    Map<String, Integer> map2 = new HashMap<>();
    map2.put("b", 4);
    map2.put("a", 1);
    map2.put("c", 5);

    Map<String, Integer> map3 = new HashMap<>();
    map3.put("b", 2);
    map3.put("a", 3);
    map3.put("c", 4);

    Map<String, Integer> map4 = new HashMap<>();
    map4.put("b", 1);
    map4.put("a", 3);

    listObjects.add(map1);
    listObjects.add(map2);
    listObjects.add(map3);
    listObjects.add(map4);

    List<String> keys = Arrays.asList("c", "a", "b");

    List<Map<String, Integer>> sortedList = sortByMapKey(listObjects, keys);

    for (Map<String, Integer> map : sortedList) {
      System.out.println(map);
    }
  }

  static List<Map<String, Integer>> sortByMapKey(List<Map<String, Integer>> listObjects,
      List<String> keys) {
    List<Map<String, Integer>> result = new ArrayList<>();
    for (Map<String, Integer> map : listObjects) {
      LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
      for (String key : keys) {

        if (map.containsKey(key)) {
          sortedMap.put(key, map.get(key));
        }

      }
      result.add(sortedMap);
    }
    return result;

  }

}
