class Node{
    int Data ;
    Node next;

    public Node(int data){
     this.Data = data;
     this.next = null;
    }
}

public class iteration {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next  =  new Node(20);
        head.next.next = new Node(30);
        
        Node temp  = head ;
        // System.out.println(temp.Data);
        // System.out.println(temp.next.Data);

        // in this head is preserve
        while (temp != null) { 
            System.out.print(temp.Data + "");
             if (head.next != null) System.out.print(" -> ");
            temp = temp.next;
        }

        System.out.println("End");
        // not preserve head , we use this if we are changing the structure
        while (head != null) { 
            System.out.print(head.Data + "");
             if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }

    }
}


