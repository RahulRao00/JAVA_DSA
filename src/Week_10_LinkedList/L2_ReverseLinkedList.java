class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        // this.next = null;
    }
}

public class L2_ReverseLinkedList {

    public static void reverseLinkedList(Node head) {
        if (head == null)
            return;

        reverseLinkedList(head.next);
        System.out.print(head.data + " -> ");
        // reverseLinkedList(head.next);

    }

    public static void main(String[] args) {

        Node a = new Node(10); // head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b; // 10 -> 20
        b.next = c; // 10 -> 20 -> 30
        c.next = d; // 10 -> 20 -> 30 -> 40
        d.next = e; // 10 -> 20 -> 30 -> 40 -> 50

        reverseLinkedList(a);

    }
}
