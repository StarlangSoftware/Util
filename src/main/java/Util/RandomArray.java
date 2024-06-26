package Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomArray {

    /**
     * The constructor of {@link RandomArray} class gets an integer itemCount as an input. Creates an array of
     * size itemCount and loops through each element of the array and initializes them with a random number by using Math.random().
     * Then, accumulates each element of the array and at the end divides each element with the resulting sum.
     *
     * @param itemCount integer input defining array size.
     * @return Normalized double array
     */
    public static double[] normalizedArray(int itemCount) {
        int i;
        double sum = 0.0;
        double[] array;
        array = new double[itemCount];
        for (i = 0; i < itemCount; i++) {
            array[i] = Math.random();
            sum += array[i];
        }
        for (i = 0; i < itemCount; i++) {
            array[i] /= sum;
        }
        return array;
    }

    /**
     * Creates and returns a random index array, where the indexes in the array are between 0 and itemCount - 1. For
     * example, if itemCount is 4, the method returns an array of indexes 0, 1, 2, 3 but shuffled.
     * @param itemCount Number of indexes
     * @param random Random number generator
     * @return Shuffled array containing numbers between 0 and itemCount - 1.
     */
    public static ArrayList<Integer> indexArray(int itemCount, Random random) {
        ArrayList<Integer> randomArray = new ArrayList<>();
        for (int i = 0; i < itemCount; i++){
            randomArray.add(i);
        }
        Collections.shuffle(randomArray, random);
        return randomArray;
    }
}
