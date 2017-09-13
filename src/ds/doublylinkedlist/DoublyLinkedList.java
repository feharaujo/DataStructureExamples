package ds.doublylinkedlist;

public class DoublyLinkedList {

    private Node first;
    private Node last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        } else {
            first.provious = newNode;
        }

        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.provious = last;
        }

        last = newNode;

    }

    public Node deleteFirstNode() {
        Node temp = first;

        if (first.next == null) {
            last = null;
        } else {
            first.next.provious = null;
        }

        first = first.next;

        return temp;
    }

    public Node deleteLastNode() {
        Node temp = last;

        if (first.next == null) {
            first = null;
        } else {
            last.provious.next = null;
        }

        last = last.provious;

        return temp;
    }

    public boolean insertAfter(int key, int data) {
        Node current = first;

        while (current.data != key) {
            current = current.next;

            if (current == null) return false;
        }

        Node newNode = new Node();
        newNode.data = data;

        if(current == last) {
            current.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next.provious = newNode;
        }

        newNode.provious = current;
        current.next = newNode;

        return true;
    }


    public void displayList() {
        System.out.println("List (first --> Last)");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
