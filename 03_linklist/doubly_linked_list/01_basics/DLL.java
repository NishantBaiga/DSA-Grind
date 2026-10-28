class Node {

    // To store the Value or data.
    int data;

    // Reference to the Previous Node
    Node prev;

    // Reference to the next Node
    Node next;

    // Constructor
    Node(int d) {
        data = d;
        prev = next = null;
    }
};

public class DLL {

    public static void main(String[] args) {
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.prev = head;

        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
    }
}
