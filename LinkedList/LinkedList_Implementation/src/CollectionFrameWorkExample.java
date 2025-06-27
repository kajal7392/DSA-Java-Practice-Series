import java.util.LinkedList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Arrays;

public class CollectionFrameworkExample {

    public static void main(String[] args) {
        // 1. Creating a LinkedList
        LinkedList<String> cities = new LinkedList<>();
        
        // 2. Adding elements (all methods demonstrated)
        cities.add("Mumbai");        // Adds to end
        cities.addFirst("Delhi");    // Adds to beginning
        cities.addLast("Bengaluru"); // Adds to end
        cities.add(1, "Hyderabad");  // Adds at specific position
        
        printList("Initial List", cities);
        
        // 3. Accessing elements
        System.out.println("\nAccess Operations:");
        System.out.println("First element: " + cities.getFirst());
        System.out.println("Last element: " + cities.getLast());
        System.out.println("Element at index 2: " + cities.get(2));
        
        // 4. Checking contents
        System.out.println("\nCheck Operations:");
        System.out.println("Contains 'Mumbai'? " + cities.contains("Mumbai"));
        System.out.println("Index of 'Bengaluru': " + cities.indexOf("Bengaluru"));
        System.out.println("Size of list: " + cities.size());
        
        // 5. Modifying elements
        cities.set(0, "New Delhi"); // Update first element
        printList("\nAfter Modification", cities);
        
        // 6. Iterating through list
        System.out.println("\nIteration Methods:");
        
        System.out.println("a) Simple for loop:");
        for(int i=0; i<cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
        
        System.out.println("\n\nb) Enhanced for loop:");
        for(String city : cities) {
            System.out.print(city + " ");
        }
        
        System.out.println("\n\nc) Using Iterator:");
        ListIterator<String> iterator = cities.listIterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
        // 7. Sorting
        Collections.sort(cities);
        printList("\n\nAfter Sorting", cities);
        
        // 8. Reversing
        Collections.reverse(cities);
        printList("After Reversing", cities);
        
        // 9. Removing elements
        System.out.println("\nRemove Operations:");
        cities.removeFirst();                   // Remove first
        cities.removeLast();                    // Remove last
        cities.remove("Hyderabad");             // Remove by object
        cities.remove(0);                       // Remove by index
        printList("After Removals", cities);
        
        // 10. Bulk operations
        System.out.println("\nBulk Operations:");
        cities.addAll(Arrays.asList("Pune", "Chennai", "Kolkata"));
        printList("After addAll", cities);
        
        cities.retainAll(Arrays.asList("Pune", "Chennai"));
        printList("After retainAll", cities);
        
        // 11. Conversion to array
        Object[] cityArray = cities.toArray();
        System.out.println("\nArray conversion: " + Arrays.toString(cityArray));
        
        // 12. Clear the list
        cities.clear();
        System.out.println("\nAfter clear(), list empty? " + cities.isEmpty());
    }
    
    // Helper method to print the list
    private static void printList(String message, LinkedList<String> list) {
        System.out.println("\n" + message + ": ");
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
    }
}
