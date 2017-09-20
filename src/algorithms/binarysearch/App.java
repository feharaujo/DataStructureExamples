package algorithms.binarysearch;

public class App {

    public static void main(String[] args) {

        int[] array = new int[10];
        array[0] = 10;
        array[1] = 110;
        array[2] = 210;
        array[3] = 310;
        array[4] = 410;

        array[5] = 510;
        array[6] = 610;
        array[7] = 710;

        array[8] = 810;
        array[9] = 910;


        System.out.println("Index: " + findIndex(array, 710));
        System.out.println("Index: " + findIndex(array, 410));
        System.out.println("Index: " + findIndex(array, 110));
        System.out.println("Index: " + findIndex(array, 999));
    }


    /**
     * Binary search
     */
    public static int findIndex(int[] array, int value) {

        int begging = 0;
        int end = array.length - 1;

        while (begging <= end) {
            int mid = (begging + end) / 2;

            if (array[mid] == value) {
                return mid;
            }

            if (array[mid] > value) {
                end = mid - 1;
            } else {
                begging = mid + 1;
            }
        }

        return -1;
    }

}
