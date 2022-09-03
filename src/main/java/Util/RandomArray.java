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

    public static ArrayList<Integer> indexArray(int itemCount, Random random) {
        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        for (int i = 0; i < itemCount; i++){
            randomArray.add(i);
        }
        Collections.shuffle(randomArray, random);
        return randomArray;
    }
}
