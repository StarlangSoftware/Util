package Util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

public class RandomArrayTest {

    @Test
    public void normalizedArrayTest() {
        double[] array;
        array = RandomArray.normalizedArray(10);
        double sum = 0.0;
        for (double d : array){
            sum += d;
        }
        assertEquals(1.0, sum, 0.0);
    }

    @Test
    public void indexArrayTest() {
        ArrayList<Integer> array;
        array = RandomArray.indexArray(10, new Random());
        int sum = 0;
        for (double d : array){
            sum += d;
        }
        assertEquals(45, sum);
    }
}