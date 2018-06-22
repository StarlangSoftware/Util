package Util;

import java.util.ArrayList;

public class Interval {
    private ArrayList<Tuple> list;

    /**
     * A constructor of {@link Interval} class which creates a new {@link ArrayList} list.
     */
    public Interval() {
        list = new ArrayList<>();
    }

    /**
     * The add method adds a new {@link Tuple} with given inputs to the list.
     *
     * @param start first element of {@link Tuple}.
     * @param end   second element of {@link Tuple}.
     */
    public void add(int start, int end) {
        list.add(new Tuple(start, end));
    }

    /**
     * The getFirst method returns the first element at the list {@link ArrayList}'s given index.
     *
     * @param index to use at getting tuple from {@link ArrayList}.
     * @return the first element at the list {@link ArrayList}'s given index.
     */
    public int getFirst(int index) {
        return list.get(index).getFirst();
    }

    /**
     * The getLast method returns the last element at the list {@link ArrayList}'s given index.
     *
     * @param index to use at getting tuple from {@link ArrayList}.
     * @return the last element at the list {@link ArrayList}'s given index.
     */
    public int getLast(int index) {
        return list.get(index).getLast();
    }

    /**
     * The size method returns the size of the list {@link ArrayList}.
     *
     * @return size of the list {@link ArrayList}.
     */
    public int size() {
        return list.size();
    }
}
