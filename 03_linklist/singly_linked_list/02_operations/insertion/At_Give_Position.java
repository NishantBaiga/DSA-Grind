
public class At_Give_Position {

    static Node insertAtGivenPosition(Node head, int index, int val) {

        // insert at start, we are using zero based index
        if (index == 0) {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }

        // traverse node before the target position example if there is 10,20,30,40 and
        // index is 3 then it traver till 2
        Node temp = head;
        for (int i = 1; i < index; i++) {

            // If the list contains 3 nodes and we try to insert at position 5, this check
            // prevents insertion at an invalid position.
            if (temp == null) {
                throw new IndexOutOfBoundsException(
                        "Position out of range");
            }
            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException(
                    "Position out of range");
        }

        // Insert the new node
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;

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
        head.next.next.next = new Node(40);

        System.out.print("Orginal : ");
        printLinkList(head);
        System.out.println();

        // in this we are usng zero based indexing
        Node ans = insertAtGivenPosition(head, 4, 16);
        

        System.out.print("Updated : ");
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