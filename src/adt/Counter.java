package adt;

public class Counter {

    private String name;
    private int value;

    public Counter(String str) {
        this.name = str;
    }

    public void increment() {
        value++;
    }

    public int getCurrentValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + ": " + value;
    }
}
