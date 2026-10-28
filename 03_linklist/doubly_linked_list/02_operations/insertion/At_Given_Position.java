class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int x) {
        data = x;
        next = prev = null;
    }
}

public class At_Given_Position {
    public static Node insertAtPos(Node head, int p, int x) {
        Node newnode = new Node(x);
        Node cur = head;

        // traverse before the given position
        for (int i = 0; i < p; i++)
            cur = cur.next;

        // for the last element
        if (cur.next == null) {
            cur.next = newnode;
            newnode.prev = cur;
        } else {
            newnode.next = cur.next;
            cur.next = newnode;
            newnode.next.prev = newnode;
            newnode.prev = cur;
        }
        return head;
    }

    // Function to print the doubly linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" <-> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Creating linked list: 2 <-> 4 <-> 5
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.prev = head;
        head.next.next = new Node(5);
        head.next.next.prev = head.next;

        int p = 0,x = 6;

        head = insertAtPos(head, p, x);

        printList(head);
    }
}
