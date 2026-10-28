import java.util.LinkedList;

public class builtin {
    public static void main(String[] args) {
        // Create a doubly linked list
        LinkedList<String> list = new LinkedList<>();

        // Add elements (End, Beginning, Specific Index)
        list.add("Middle");         // ["Middle"]
        list.addFirst("Start");     // ["Start", "Middle"]
        list.addLast("End");        // ["Start", "Middle", "End"]
        list.add(1, "Inserted");    // ["Start", "Inserted", "Middle", "End"]

        // Read elements
        String first = list.getFirst(); // "Start"
        String last = list.getLast();   // "End"
        String specific = list.get(2);  // "Middle" (Requires traversal)

        // Remove elements
        list.removeFirst();         // Removes "Start"
        list.removeLast();          // Removes "End"
        list.remove("Inserted");    // Removes "Inserted" by value

        // Print final list
        System.out.println(list);   // Output: ["Middle"]
    }
}
