
class SLL {
    Node head;
    Node tail;
    int size;

    void insertAtEnd(int data) {
        Node temp = new Node(data);
        if( head == null) {
            head = temp;
            tail  = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

}

public class Child {

    public static void main(String[] args) {

        SLL list = new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
    

    }
}