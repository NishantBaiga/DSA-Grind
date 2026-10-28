class Node {
    int data;
    Node next, prev;

    Node(int newData) {
        data = newData;
        next = prev = null;
    }
}

public class At_End {
    public static Node insertEnd(Node head, int newData) {
        // Create a new node
        Node newNode = new Node(newData);
        // If the linked list is empty, set the new node as
        // the head
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            // Set the next of last node to the new node
            curr.next = newNode;
            // Set the prev of new node to the last node
            newNode.prev = curr;
        }
        return head;
    }

    // Function to print the doubly
    // linked list in required format
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" <-> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a hardcoded doubly linked list:
        // 1 <-> 2 <-> 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        // Insert a new node with data 4 at the end
        head = insertEnd(head, 4);

        printList(head);
    }
}