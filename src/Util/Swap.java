package Util;

public class Swap {

    public static void swap(double[] array, int i, int j){
        double t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void swap(int[] array, int i, int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
