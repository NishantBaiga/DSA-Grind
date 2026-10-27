
public class At_End {

    static Node insertAtEnd(Node head, int value) {
        Node newNode = new Node(value);

        // If the Linked List is empty, make
        // the new node as the head and return
        if (head == null) {
            return newNode;
        }

        // Store the head reference in a temporary variable
        // Traverse till the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode; // change next pointer of last node to the newNode
        return head;

    }

    static void printLinkList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.print(" -> END | NULL ");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node ans = insertAtEnd(head, 3);
        printLinkList(ans);
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}