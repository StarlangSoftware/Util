package Util;

public class Swap {

    /**
     * The swap method takes a double {@link java.lang.reflect.Array} and two integer numbers i,j. And interchange the given array's
     * items at index i and index j.
     *
     * @param array double {@link java.lang.reflect.Array} input.
     * @param i     first index to swap.
     * @param j     second index to change.
     */
    public static void swap(double[] array, int i, int j) {
        double t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    /**
     * The swap method takes an integer {@link java.lang.reflect.Array} and two integer numbers i,j. And interchange the given array's
     * items at index i and index j.
     *
     * @param array integer {@link java.lang.reflect.Array} input.
     * @param i     first index to swap.
     * @param j     second index to change.
     */
    public static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
