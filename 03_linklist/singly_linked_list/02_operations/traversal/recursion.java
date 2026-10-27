
public class recursion {

    static void traverseList(Node head) {
        // base condition is when the head is null
        if (head == null) {
            System.out.println();
            return;
        }

        // printing the current node data
        System.out.print(head.data);

        // print arrow if not the last node
        if (head.next != null) {
            System.out.print(" -> ");
        }

        // moving to the next node
        traverseList(head.next);

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        traverseList(head);
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