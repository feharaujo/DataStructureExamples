package algorithms.linearsearch;

public class App {

    public static void main(String... args) {

    }

    public static int findIndexItem(int[] items, int value) {

        int index = -1;
        for (int i = 0; i < items.length; i++) {
            if(items[i] == value) {
                index = i;
                break;
            }
        }

        return index;
    }


}
