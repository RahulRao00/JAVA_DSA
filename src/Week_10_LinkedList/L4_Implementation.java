 package src.WEEK_10_LinkedList;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SLL {

    Node head;
    Node tail;
    int size;

    // this will add new node at the end of the linkedList
    void insertAtEnd(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }

    // this will add the node at beginning of the linkedList
    void insertAtStart(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }

        size++;
    }

    // this will insert the Node at the given index
    void insertAtIndex(int idx, int data) {

        if (idx == 0) {
            insertAtStart(data);
            return;
        }
        if (idx == size) {
            insertAtEnd(data);
            return;
        }
        if (idx > size) {
            System.out.println("\nUnreachable index please enter valid index");
            return;
        }

        Node temp = new Node(data);
        Node x = head;

        // this for loop bring the pointer the insertion node
        for (int i = 0; i < idx; i++) {
            x = x.next;
        }

        // insertion logic
        temp.next = x.next;
        x.next = temp;

        size++;
    }

    // this will display the linkedList
    void displaySLL() {
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void size() {
        System.out.println("\nSize is : " + size);
    }
}

public class L4_Implementation {
    public static void main(String[] args) {

        SLL list = new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.displaySLL();
        list.size();

        list.insertAtEnd(100);
        System.out.println();

        list.displaySLL();

        list.size();

        list.insertAtStart(1000);
        list.displaySLL();
        list.size();

        list.insertAtIndex(2, 99);
        list.displaySLL();

        list.insertAtIndex(10, 01000);
        list.displaySLL();

    }
}
