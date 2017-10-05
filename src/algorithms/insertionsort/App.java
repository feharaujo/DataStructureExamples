package algorithms.insertionsort;

public class App {

    public static void main(String... args) {
        int[] array = new int[]{9, 15, 7, 3, 77, 90, 1};
        array = insertSort(array);
        printArray(array);

    }

    private static int[] insertSort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            for (int j = i; j > 0; j--) {
                int x = array[j - 1];
                if(array[j] < x) {
                    int aux = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = aux;
                }
            }

        }

        return array;

    }

    private static void printArray(int[] array) {
        for (int item: array) {
            System.out.println("[" + item + "]");
        }
    }

}
