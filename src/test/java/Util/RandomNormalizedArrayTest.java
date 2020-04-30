package Util;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomNormalizedArrayTest {

    @Test
    public void get() {
        double[] array;
        RandomNormalizedArray randomNormalizedArray;
        randomNormalizedArray = new RandomNormalizedArray(10);
        array = randomNormalizedArray.get();
        double sum = 0.0;
        for (double d : array){
            sum += d;
        }
        assertEquals(1.0, sum, 0.0);
    }
}