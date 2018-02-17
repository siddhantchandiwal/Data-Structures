package ds.circularLinkedList;

public class App {

    public static void main(String [] args){
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(90);
        myList.insertFirst(80);
        myList.insertFirst(70);
        myList.insertFirst(60);

        myList.displayList();

        myList.deleteFirst();

        myList.displayList();

        myList.insertLast(120);

        myList.displayList();
    }
}
