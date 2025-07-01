
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class Child {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node temp = head;

        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }

    }
}