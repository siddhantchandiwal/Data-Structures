package ds.linkedlist;

public class App {

    public static void main(String [] args){
        Node first = new Node();
        first.data = 5;

        Node second = new Node();
        second.data = 8;

        Node third = new Node();
        third.data = 10;

        Node fourth = new Node();
        fourth.data = 15;

        first.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Node Value is : " +listLength(first));
        System.out.println("Node Value is : " +listLength(second));
        System.out.println("Node Value is : " +listLength(third));
    }

    public static int listLength(Node newNode){
        int value =0;

        Node currentNode = newNode;
        while(currentNode!=null){
            value++;
            currentNode = currentNode.next;
        }
        return value;
    }
}
