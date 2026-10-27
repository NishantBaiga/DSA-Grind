class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class At_Given_Position {
    static Node DeleteNode(Node head, int index) {
        Node temp = head;

        if (index == 0) {
            head = temp.next;
            temp = null; 
            return head;
        }


        Node prev = null;
        for (int i = 1; i < index; i++) {
            prev = temp;
            temp = temp.next; 
        }

        prev.next = temp.next;
        temp = null;
        return head;

    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list:
        // 2 -> 5 -> 7 -> 8 -> 99 -> 100
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(99);
        head.next.next.next.next.next = new Node(100);

        System.out.print("original : ");
        printList(head);
        System.out.println();
        
        System.out.print("update : ");
        Node ans = DeleteNode(head, 0);
        printList(ans);
    }
}
