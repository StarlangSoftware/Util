package Util;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubsetTest {

    @Test
    public void next1() {
        int[] firstSubSet;
        int count;
        Subset subSet;
        subSet = new Subset(1, 10, 5);
        firstSubSet = subSet.get();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, firstSubSet);
        count = 1;
        while (subSet.next()){
            count++;
        }
        assertEquals(252, count);
    }

    @Test
    public void next2() {
        int[] firstSubSet;
        int count;
        Subset subSet;
        subSet = new Subset(1, 20, 3);
        firstSubSet = subSet.get();
        assertArrayEquals(new int[]{1, 2, 3}, firstSubSet);
        count = 1;
        while (subSet.next()){
            count++;
        }
        assertEquals(1140, count);
    }

    @Test
    public void next3() {
        int count = 0;
        Subset subSet;
        for (int i = 0; i <= 10; i++){
            subSet = new Subset(1, 10, i);
            count++;
            while (subSet.next()){
                count++;
            }
        }
        assertEquals(1024, count);
    }

}