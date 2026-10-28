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
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
               System.out.print(" --> "); 
            }
            temp = temp.next;
        }
        System.out.println(" --> NULL ");
    }

    static void BackwardTraversal(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.prev != null) {
                System.out.print(" --> ");
            }
            temp = temp.prev;
        }
        System.out.print(" --> null");
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
        ForwardTraversal(head); // passing  head 


        System.out.println("");


        System.out.print("Backward Traversal: ");
        BackwardTraversal(third); // passinmg tail
    }
}
