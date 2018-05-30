package Util;

public class SubsetFromList extends Subset{
    private int[] elementlist;
    private int[] indexlist;

    public SubsetFromList(int[] list, int elementcount){
        int multisetcount, i;
        this.elementlist = list;
        this.elementcount = elementcount;
        multisetcount = ((elementcount + 2) * (elementcount + 1)) / 2;
        set = new int[elementcount];
        indexlist = new int[elementcount];
        mset = new int[multisetcount];
        for (i = 0; i < elementcount; i++){
            indexlist[i] = i;
            set[i] = elementlist[indexlist[i]];
        }
    }

    public boolean next() {
        int i, j;
        for (i = elementcount - 1; i > -1; i--) {
            indexlist[i]++;
            if (indexlist[i] < elementlist.length - elementcount + i + 1)
                break;
        }
        if (i == -1)
            return false;
        set[i] = elementlist[indexlist[i]];
        for (j = i + 1; j < elementcount; j++){
            indexlist[j] = indexlist[j - 1] + 1;
            set[j] = elementlist[indexlist[j]]; 
        }
        return true;
    }
}
