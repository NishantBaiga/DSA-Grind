// WAY 3: Separate top-level class
// Independent of SLL; no outer-class object is required.
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class SLL {

   // Definition of a Node in a singly linked list
    public static class Node {
        // Data part of the node
        int data;
        // Pointer to the next node in the list
        Node next;
        // Constructor to initialize the node with data
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // WAY 1: Non-static inner class
    // Requires an SLL object to create a Node from a static context.
    public class InnerNode {
        int data;
        InnerNode next;
        public InnerNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // WAY 2: Static nested class
    // Can be instantiated directly inside the static main() method.
    public static class StaticNode {
        int data;
        StaticNode next;
        public StaticNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);

        System.out.println("Reference to the first node of the linked list :" + head);
        System.out.println("Accesses the data stored in the first node. Here, it is " + head.data);
        System.out.println("Reference to the next node. Here, it is null because there is no second node." + head.next);

        // 1. Creating an object of a non-static inner class
        SLL list = new SLL(); // First create the outer class object
        InnerNode node1 = list.new InnerNode(10);

        // 2. Creating an object of a static nested class
        StaticNode node2 = new StaticNode(20);

        // 3. Creating an object of a separate top-level Node class
        Node node3 = new Node(30);
    }
}


