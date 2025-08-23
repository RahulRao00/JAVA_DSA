package src.WEEK_11_LinkedList2.Doubly_LL;

class Node {
    int data;
    Node next;
    Node prev;

    Node( int data ) {
        this.data = data;
    }
}

public class L0_Basic_DLL_Node {

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        a.prev = null;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        Node temp = a;
        while( temp != null ) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }

        //System.out.println(e.next);
        //System.out.println(e.prev.data);
        //System.out.println(b.next.data);
        //System.out.println(b.prev.data);

        Node x = new Node(100);
        temp = a;
        for( int i  = 0; i < 2; i++ ) {
            temp = temp.next;
        }

        x.next = temp.next;
        temp.next = x;
        x.prev = temp;
        x.next.prev = x;

        System.out.println();
        temp = a;
        while( temp != null ) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }

    }
}
