class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

public class At_Begnning {
    // Deletes the first node (head) of the list
    // and returns the second node as new head
    static Node deleteHead(Node head) {
        // if zero elements
        if (head == null)
            return null;

        Node temp = head;
        head = head.next;

        if (head != null)
            head.prev = null;

        temp = null; // allow garbage collection
        return head;
    }

    static void printList(Node head) {
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
        // Create a hardcoded doubly linked list: 1 <-> 2 <-> 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        // Delete first node
        head = deleteHead(head);

        printList(head);
    }
}
