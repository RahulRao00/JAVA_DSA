// package src.WEEK_10_LinkedList;

public class L3_LinkedListImplementation {

    public static void main(String[] args) {

        Node ll0 = new Node(10);
        Node ll1 = new Node(20);
        Node ll2 = new Node(30);
        Node ll3 = new Node(40);
        Node ll4 = new Node(50);

        ll0.next = ll1;
        ll1.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;
        // ll4.next = ll0;

        Node temp = ll0;
        int counter = 0;
        while (temp.next != null) {

            if (counter < 10) {
                System.out.println(temp.data);

            }
            temp = temp.next;
            counter++;
        }

    }

}
