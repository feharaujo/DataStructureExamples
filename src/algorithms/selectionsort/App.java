package algorithms.selectionsort;

public class App {

    public static void main(String... args) {
        int[] sortArray = selectionSort(
                new int[]{9, 8, 3, 13, 87, 12, 99, 2, 7, 50}
        );

        for (int item: sortArray) {
            System.out.println(String.valueOf(item));
        }
    }

    static int[] selectionSort(int[] array) {
        int length = array.length;
        int initAtIndex = 0;

        while (isIndexsEquals(initAtIndex, array.length)) {

            int minValueIndexTemp = initAtIndex;
            for (int i = initAtIndex; i < length; i++) {

                if(array[minValueIndexTemp] > array[i]) {
                    minValueIndexTemp = i;
                }
            }

            int tempValue = array[initAtIndex];
            array[initAtIndex] = array[minValueIndexTemp];
            array[minValueIndexTemp] = tempValue;

            initAtIndex++;
        }

        return array;
    }

    private static boolean isIndexsEquals(int initIndex, int arrayLength) {
        return initIndex != arrayLength -1;
    }

}
