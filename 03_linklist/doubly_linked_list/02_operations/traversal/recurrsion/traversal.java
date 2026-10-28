class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class traversal {

    static void ForwardTraversal(Node head) {
        if (head == null) {
            return;
        }
        // Print current node's data
        System.out.print(head.data + " ");

        // Recursive call with the next node
        ForwardTraversal(head.next);
    }

    static void BackwardTraversal(Node tail) {
        if (tail == null)
            return;

        // Print current node's data
        System.out.print(tail.data + " ");

        // Recursive call with the previous node
        BackwardTraversal(tail.prev);
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.print("Forward Traversal: ");
        ForwardTraversal(head); // passing head

        System.out.println("");

        System.out.print("Backward Traversal: ");
        BackwardTraversal(third); // passing tail
    }
}
