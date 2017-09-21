package algorithms.recursion;

public class App {

    public static void main(String... args) {
        //reduceByOne(5);
        System.out.println(recursiveLinearSearch(new int[]{4, 48, 35, 27, 88, 96, 64, 11, 43, 23, 55}, 0, 11));
    }

    public static void reduceByOne(int n) {

        if (n >= 0) {
            reduceByOne(n - 1);
        }

        System.out.println("Number: " + n);

    }

    public static int recursiveLinearSearch(int[] array, int index, int x) {
        if (index > array.length - 1) {
            return -1; // not found
        } else if (array[index] == x) {
            return index;
        } else {
            System.out.println("Index at:" + index);
            return recursiveLinearSearch(array, index + 1, x);
        }

    }

}
