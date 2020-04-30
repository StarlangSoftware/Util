package Util;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubsetFromListTest {

    @Test
    public void next1() {
        int[] firstSubSet;
        int count;
        SubsetFromList subSet;
        subSet = new SubsetFromList(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, 5);
        firstSubSet = subSet.get();
        assertArrayEquals(new int[]{10, 20, 30, 40, 50}, firstSubSet);
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
        subSet = new SubsetFromList(new int[]{9, 8, 2, 12, 7, 16, 17}, 3);
        firstSubSet = subSet.get();
        assertArrayEquals(new int[]{9, 8, 2}, firstSubSet);
        count = 1;
        while (subSet.next()){
            count++;
        }
        assertEquals(35, count);
    }

    @Test
    public void next3() {
        int count = 0;
        Subset subSet;
        for (int i = 0; i <= 9; i++){
            subSet = new SubsetFromList(new int[]{9, 8, 2, 12, 7, 16, 17, 8, 3}, i);
            count++;
            while (subSet.next()){
                count++;
            }
        }
        assertEquals(512, count);
    }

}