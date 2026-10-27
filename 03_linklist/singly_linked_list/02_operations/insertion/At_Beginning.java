class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class At_Beginning {

    static Node insertAtBeginnig(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // insert element at beginnig in exsiting linklist
       Node ans =  insertAtBeginnig(head, 50);

       // print 
       Node temp  = ans ; // we can also direct loop ans 
        while (temp != null) { 
            System.out.print(temp.data + "");
             if (head.next != null) System.out.print(" -> ");
            temp = temp.next;
        }

    }
}

