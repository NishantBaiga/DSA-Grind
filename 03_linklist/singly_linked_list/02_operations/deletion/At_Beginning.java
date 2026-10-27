class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class At_Beginning {

    static Node DeleteAtBegnning(Node head) {
        // if there no element
        if (head == null) {
            return null;
        }

        Node temp = head;
        head = head.next;
        temp = null;

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

        System.out.print("original : ");
        printLinkList(head);
        System.out.println();

        Node Ans = DeleteAtBegnning(head);
        System.out.print("updated : ");
        printLinkList(Ans);
    }
}
