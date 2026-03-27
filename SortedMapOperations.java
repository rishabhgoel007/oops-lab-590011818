import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapOperations {
    public static void main(String[] args) {

        // Creating SortedMap using TreeMap
        SortedMap<Integer, String> map = new TreeMap<>();

        // 1. INSERTION
        map.put(3, "Mango");
        map.put(1, "Apple");
        map.put(4, "Orange");
        map.put(2, "Banana");
        System.out.println("After Insertion: " + map);

        // 2. DELETION
        map.remove(2);
        System.out.println("After Deletion: " + map);

        // 3. UPDATE
        map.put(3, "Grapes"); // replaces Mango
        System.out.println("After Update: " + map);

        // 4. SEARCHING
        if (map.containsKey(1)) {
            System.out.println("Key 1 found with value: " + map.get(1));
        } else {
            System.out.println("Key not found");
        }

        if (map.containsValue("Orange")) {
            System.out.println("Value Orange exists");
        }

        // 5. TRAVERSAL

        // entrySet()
        System.out.println("Traversal using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // keySet()
        System.out.println("Traversal using keySet:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // lambda
        System.out.println("Traversal using lambda:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}