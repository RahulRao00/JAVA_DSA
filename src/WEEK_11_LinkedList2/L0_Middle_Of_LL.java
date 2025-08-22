package src.WEEK_11_LinkedList2;
//  import src.WEEK_10_LinkedList.L0_BasicNodes;

class Node {

    int data;
    Node next;
    Node( int data) {
        this.data = data;
    }
}

public class L0_Middle_Of_LL {

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(700);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node temp = a;
        int len = 0;
        while( temp != null ) {
            temp = temp.next;
            len++;
        }
        temp  = a;
        for( int i =0; i < len/2; i++ ) {
            temp = temp.next;

        }
        System.out.println(temp.data);
    }


}
