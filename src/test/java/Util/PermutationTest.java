package Util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {

    @Test
    public void next1() {
        int[] firstPermutation;
        int count;
        Permutation permutation;
        permutation = new Permutation(3);
        firstPermutation = permutation.get();
        assertArrayEquals(new int[]{0, 1, 2}, firstPermutation);
        count = 1;
        while (permutation.next()){
            count++;
        }
        assertEquals(6, count);
    }

    @Test
    public void next2() {
        int[] firstPermutation;
        int count;
        Permutation permutation;
        permutation = new Permutation(5);
        firstPermutation = permutation.get();
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, firstPermutation);
        count = 1;
        while (permutation.next()){
            count++;
        }
        assertEquals(120, count);
    }

}