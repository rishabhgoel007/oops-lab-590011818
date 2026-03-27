import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {

        // Create Set
        Set<String> set = new HashSet<>();

        // 1. INSERTION
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        System.out.println("After Insertion: " + set);

        // 2. DELETION
        set.remove("Banana");
        System.out.println("After Deletion: " + set);

        // 3. UPDATE (remove + add)
        if (set.contains("Mango")) {
            set.remove("Mango");
            set.add("Grapes");
        }
        System.out.println("After Update: " + set);

        // 4. SEARCHING
        if (set.contains("Apple")) {
            System.out.println("Apple found");
        } else {
            System.out.println("Apple not found");
        }

        // 5. TRAVERSAL

        // for-each loop
        System.out.println("Traversal (for-each):");
        for (String item : set) {
            System.out.println(item);
        }

        // lambda
        System.out.println("Traversal (lambda):");
        set.forEach(item -> System.out.println(item));
    }
}