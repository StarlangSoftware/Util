package Util;

public class RandomNormalizedArray {

    private double[] array;

    public RandomNormalizedArray(int itemCount){
        int i;
        double sum = 0.0;
        array = new double[itemCount];
        for (i = 0; i < itemCount; i++){
            array[i] = Math.random();
            sum += array[i];
        }
        for (i = 0; i < itemCount; i++){
            array[i] /= sum;
        }
    }

    public double[] get(){
        return array;
    }

}
