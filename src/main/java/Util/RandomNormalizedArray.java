package Util;

public class RandomNormalizedArray {

    private double[] array;

    /**
     * The constructor of {@link RandomNormalizedArray} class gets an integer itemCount as an input. Creates an array of
     * size itemCount and loops through each element of the array and initializes them with a random number by using Math.random().
     * Then, accumulates each element of the array and at the end divides each element with the resulting sum.
     *
     * @param itemCount integer input defining array size.
     */
    public RandomNormalizedArray(int itemCount) {
        int i;
        double sum = 0.0;
        array = new double[itemCount];
        for (i = 0; i < itemCount; i++) {
            array[i] = Math.random();
            sum += array[i];
        }
        for (i = 0; i < itemCount; i++) {
            array[i] /= sum;
        }
    }

    /**
     * Getter for the double {@link java.lang.reflect.Array}.
     *
     * @return the double {@link java.lang.reflect.Array}.
     */
    public double[] get() {
        return array;
    }

}
