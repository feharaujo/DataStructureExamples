package ds.queue;

public class Queue {

    // initializes the set number of slots
    private int maxSize;

    // main data
    private long[] queArray;

    // index position of element in the front
    private int front;

    // index position of element at the back
    private int rear;

    // counter - number of items in the queue
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queArray = new long[maxSize];
        this.front = 0;
        this.rear = -1; // no item
        this.nItems = 0; // we dont have elements in the array yet
    }

    public void insert(long j) {
        if(rear == maxSize - 1) {
            rear = -1;
        }

        rear++;
        queArray[rear] = j;
        nItems++;
    }

    // remove item from the front of the queue
    public long remove() {
        long temp = queArray[front];
        front++;
        if(front == maxSize) {
            front = 0;
        }
        nItems --;

        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public void view() {
        System.out.print("[ ");
        for (long item: queArray) {
            System.out.print(item + " ");
        }
        System.out.print(" ]");
    }

}
