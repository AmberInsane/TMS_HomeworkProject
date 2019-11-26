package hw_14.task_3;

import java.util.*;

//Есть две HashMap<String, List<Integer>>, нужно сделать из них одну (смержить)
public class MapMergeMain {
    public static void main(String[] args) {
        Map<String, List<Integer>> firstMap = new HashMap<>();

        firstMap.put("Hello", new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }});
        firstMap.put("Hola", new ArrayList<>() {{
            add(3);
            add(4);
            add(6);
        }});
        firstMap.put("Hi", new ArrayList<>() {{
            add(1);
            add(7);
            add(9);
        }});
        System.out.println("First map");
        System.out.println(firstMap);

        Map<String, List<Integer>> secondMap = new HashMap<>();
        secondMap.put("Hello", new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }});
        secondMap.put("Privet", new ArrayList<>() {{
            add(3);
            add(4);
            add(6);
        }});
        secondMap.put("Hi", new ArrayList<>() {{
            add(1);
            add(8);
            add(3);
        }});
        System.out.println("Second map");
        System.out.println(secondMap);

        Map<String, List<Integer>> mapAll = new HashMap<>(firstMap);

        /*
        здесь хороший пример с использованием возможностей java 8
        https://www.baeldung.com/java-merge-maps
        */
        secondMap.forEach((key, list) -> {
            if (mapAll.containsKey(key)) {
                mapAll.get(key).addAll(list);
            } else {
                mapAll.put(key, list);
            }
        });
        System.out.println("Map of all");
        System.out.println(mapAll);
    }
}
