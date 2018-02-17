package ds.doublyLinkedList;

public class App {

    public static void main (String [] args){
        DoublyLinkedList d = new DoublyLinkedList();

        d.insertFirst(100);
        d.insertFirst(200);
        d.insertFirst(300);
        d.insertFirst(400);
        d.insertFirst(500);
        d.insertFirst(600);
        d.insertLast(800);
        d.insertLast(1000);
        d.displayForward();
        d.displayBackward();
        d.deleteFirst();
        d.deleteLast();
        d.displayForward();
        d.insertAfter(200, 250);
        d.insertAfter(300, 350);
        d.displayForward();
    }
}
