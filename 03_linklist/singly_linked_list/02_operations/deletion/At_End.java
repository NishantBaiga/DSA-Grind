class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class At_End {
    static Node DeleteAtEnd(Node head) {
        // If the list is empty, return null
        if (head == null) {
            return null;
        }

        // If the list has only one node,
        // delete it and return null
        if (head.next == null) {
            return null;
        }

        // Find the second last node
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        // Delete the last node by making
        // secondLast point to null
        secondLast.next = null;

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

        Node Ans = DeleteAtEnd(head);
        System.out.print("updated : ");
        printLinkList(Ans);
    }

}
