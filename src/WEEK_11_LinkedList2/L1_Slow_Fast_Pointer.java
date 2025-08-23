package src.WEEK_11_LinkedList2;

public class L1_Slow_Fast_Pointer {

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);

        // 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70

        // linking all the nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        // slow and fast nodes
        Node slow  = a;
        Node fast  = a;

        while( fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
        System.out.println(fast.data);

    }
}


