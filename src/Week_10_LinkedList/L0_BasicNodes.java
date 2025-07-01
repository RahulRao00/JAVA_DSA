// package src.Week_10_LinkedList;


// Node creating in which there is  data and reference variable 
class Node {

    int data ;
    Node next;

    Node( int data ) {
        this.data = data;
        this.next = null;
    }

}


public class L0_BasicNodes {

    public static void main(String[] args) {
        
    Node a = new Node(10);
    System.out.println(a);   // this print a kind of address/reference of node 
    System.out.println(a.data); // data of the node 
    System.out.println(a.next); // null 

    Node b = new Node(10);
    Node c = new Node(10);
    Node d = new Node(10);
    
    }
}
