package ds.stack;

public class Stack {

    // Stack size
    private int maxSize;

    // Container
    private char[] stackArray;

    // Index position of the last item
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    /**
     * New item in the ds.stack
     *
     * @param j
     */
    public void push(char j) {
        if (isFull()) {
            System.out.println("This stack is full");
        } else {
            top++;
            stackArray[top] = j;
        }

    }

    public char pop() {
        if(isEmpty()) {
            System.out.println("This stack is empty");
            return '0';
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }

    }

    public long peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return ((maxSize -1) == top);
    }

}
