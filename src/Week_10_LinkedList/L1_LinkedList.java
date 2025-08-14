package src.WEEK_10_LinkedList;


public class L1_LinkedList {

    // print using recursion 
    public static void displayRecursive(Node head) {
        if (head == null) return;
        System.out.println(head.data);
        displayRecursive(head.next);

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

        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

        Node temp = a; // this is reference Node

        // while (temp.next != null) {
        //     System.out.print(temp.data + " -> ");
        //     temp = temp.next;
        // }
        // System.out.print(temp.data);


        System.out.println("Using recursion ");
        displayRecursive(temp);

    }
}

