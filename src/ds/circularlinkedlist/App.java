package ds.circularlinkedlist;

public class App {

    public static void main(String... args) {
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(120);
        myList.insertFirst(80);
        myList.insertLast(500);
        myList.insertLast(66);

        myList.displayList();
    }

}
