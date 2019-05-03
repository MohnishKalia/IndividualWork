package apreview;

public class MarbleSet {
    private String color;
    private int numMarbles;

    /** Constructs a new MarbleSet object */
    public MarbleSet(String color, int numMarbles) {
        /* implementation not shown */
        this.color = color;
        this.numMarbles = numMarbles;
    }

    /**
     * @return the color of the set of marbles
     */
    public String getColor() {
        /* implementation not shown */
        return color;
    }

    /**
     * @return the number of marbles in the set
     */
    public int getNumber() {
        /* implementation not shown */
        return numMarbles;
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}