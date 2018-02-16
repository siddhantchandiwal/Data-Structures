package ds.singlyLinkedList;

public class SinglyLinkedList {

    public SinglyLinkedList(){

    }

    public Node first;

    public boolean isEmpty(){
        return (first==null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("******************");
        Node current = first;
        while(current!=null){
            current.displayNode();
            current = current.next;
        }
    }

    public void insertLast(int data){
        Node current = first;
        while(current.next!=null){
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
}
