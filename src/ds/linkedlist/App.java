package ds.linkedlist;

public class App {

    public static void main(String[] args) {

        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 8;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeC));

    }


    public static int listLength(Node node) {
        int counter = 0;
        Node currentNode = node;

        while (currentNode != null) {
            counter++;
            currentNode = currentNode.next;
        }

        return counter;
    }

}
