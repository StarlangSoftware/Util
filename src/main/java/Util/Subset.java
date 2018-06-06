package Util;

import java.util.Arrays;

/**
 * @author Olcay
 */
public class Subset {
    protected int[] set, mset;
    private int rangeend;
    protected int elementcount;

    public Subset(int rangestart, int rangeend, int elementcount) {
        int i, multisetcount;
        this.rangeend = rangeend;
        this.elementcount = elementcount;
        multisetcount = ((elementcount + 2) * (elementcount + 1)) / 2;
        set = new int[elementcount];
        mset = new int[multisetcount];
        for (i = 0; i < elementcount; i++)
            set[i] = rangestart + i;
    }

    public Subset(){        
    }

    public int[] get() {
        return set; 
    }

    public int[] getX(int M) {
        int[] X;
        int i;
        X = new int[elementcount + 2];
        X[0] = 0;
        for (i = 0; i < elementcount; i++){
            X[i + 1] = set[i];
        }
        X[elementcount + 1] = M;
        return X;
    }

    public int[] getmultiset() {
        return mset;
    }

    public void multiset(int M) {
        int i, j, k;       
        j = 0;
        for (i = 0; i < elementcount; i++) {
            mset[j] = set[i];
            j++;
            mset[j] = M - set[i];
            j++;
        }
        mset[j] = M;
        j++;
        for (i = elementcount - 1; i > 0; i--)
            for (k = i - 1; k >= 0; k--) {
                mset[j] = set[i] - set[k];
                j++;
            }
        Arrays.sort(mset);
    }

    public boolean next() {
        int i, j;
        for (i = elementcount - 1; i > -1; i--) {
            set[i]++;
            if (set[i] <= rangeend - elementcount + i + 1)
                break;
        }
        if (i == -1)
            return false;
        for (j = i + 1; j < elementcount; j++)
            set[j] = set[j - 1] + 1;
        return true;
    }

    public void print() {
        int i;
        for (i = 0; i < elementcount; i++)
            System.out.print(set[i] + " ");
        System.out.println();
    }
}
