package Util;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {

    public static void main(String[] args) {

        //One tuple consist of two integer number First and Last respectively.
        Tuple tuple = new Tuple(1,4);

        //Creates Interval Object
        Interval interval = new Interval();
        //Adding Tuples to interval.
        interval.add(1,2);
        interval.add(3,5);
        interval.add(4,8);
        interval.add(7,11);

        //the first element at the list interval's given index.
        System.out.println(interval.getFirst(1));
        //the last element at the list interval's given index.
        System.out.println(interval.getLast(2));

        //Output First integer
        System.out.println("First element: "+tuple.first);
        //Output Last integer
        System.out.println("Last element: "+tuple.last);

        // Creates a double array as a size of 3 and divide each element to sum.
        RandomNormalizedArray randomNormalizedArray = new RandomNormalizedArray(3);
        //Output of the array.
        printDoubleArray(randomNormalizedArray.get());


        //Creates an integer array 0 to given input which is 3.
        Permutation permutation = new Permutation(3);

        //Output of the generated array.
        printIntegerArray(permutation.get());


        while (permutation.next()!=false) {
            permutation.next();
            //Output of the all permutations.
            printIntegerArray(permutation.get());
        }

        int[] arrayList = {5,21,0,9,5,3};
        //Creates subsets from given integer array with given element count which in this case is 3.
        SubsetFromList subsetFromList = new SubsetFromList(arrayList,3);

        while (subsetFromList.next()!=false){
            subsetFromList.next();
            //Output of the all element sets with given elementCount in this case 2 element listed.
           printIntegerArray(subsetFromList.set);
        }

    }
    //Method for printing Integer arrays.
    public static void printIntegerArray(int[] a){
        System.out.print("\n");
        for (int i=0;i<a.length;i++){
            System.out.print("["+a[i]+"]");
        }
    }
    //Method for printing Double arrays.
    public static void printDoubleArray(double[] a){
        System.out.print("\n");
        for (int i=0;i<a.length;i++){
            System.out.print("["+a[i]+"]");
        }
    }

}
