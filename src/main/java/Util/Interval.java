package Util;

import java.util.ArrayList;

public class Interval {
    private ArrayList<Tuple> list;

    public Interval(){
        list = new ArrayList<>();
    }

    public void add(int start, int end){
        list.add(new Tuple(start, end));
    }

    public int getFirst(int index){
        return list.get(index).getFirst();
    }

    public int getLast(int index){
        return list.get(index).getLast();
    }

    public int size(){
        return list.size();
    }
}
