package Util;

public class Tuple {
    int first;
    int last;

    /**
     * The constructor of {@link Tuple} class which takes two integer inputs and initializes first and last variables
     * with given inputs.
     *
     * @param first integer input.
     * @param last  integer input.
     */
    public Tuple(int first, int last) {
        this.first = first;
        this.last = last;
    }

    /**
     * Getter for the first item at {@link Tuple}.
     *
     * @return the first item.
     */
    public int getFirst() {
        return first;
    }

    /**
     * Getter for the last item at {@link Tuple}.
     *
     * @return the last item.
     */
    public int getLast() {
        return last;
    }
}
