/**
 * A Catfish subclass that extends the Fish superclass.
 * @author danny_cyd
 * @version October 7, 2024.
 */
public class Catfish extends Fish {
    private Double whiskerLength;

    /**
     * A constructor with four parameters.
     *
     * The following three parameters are same in the Fish constructor and are thus called into the super method
     * @param name   the name of the catfish
     * @param length the end-to-end length of the catfish in inches
     * @param weight the weight of the catfish in ounces
     *
     * This following parameter is an instance variable specific to catfish
     * @param whiskerLength the length of the catfish's whisker
     */
    public Catfish(String name, Double length, Double weight, Double whiskerLength) {
        super(name, length, weight);
        setWhiskerLength(whiskerLength);
    }


    /**
     * A constructor that takes in no parameters.
     */
    public Catfish() {
        this("Bubba", 52.0, 720.0, 5.0);
    }

    /**
     * A deep copy constructor with the another CatFish object as parameter.
     * @param otherCatFish another CatFish from which we want to deep copy
     */
    public Catfish(Catfish otherCatFish) {
        this(otherCatFish.name, otherCatFish.length, otherCatFish.weight, otherCatFish.whiskerLength);
    }

    /**
     * @return Returns a boolean reflecting if this catfish is shaggy. A catfish is said to
     * be shaggy if its longest whisker is longer than its end-to-end length.
     */
    public boolean isShaggy() {
        return this.whiskerLength > this.length;
    }

    /**
     * Overrides the corresponding method in the Fish super class, such that a more Catfish specific String is returned.
     * @return Returns a detailed description of the Catfish, including its key instance variables
     * such as its name, its length, its weight, its whisker length, and whether it is shaggy.
     */
    public String toString() {
        String printStr = "%s I'm a catfish whose longest whisker is %.2f, so I %s shaggy.";
        return String.format(printStr, super.toString(), this.whiskerLength, isShaggy() ? "am" : "am not");
    }

    /**
     * A private setter for whiskerLength which when the input is invalid, sets the field to its
     * default value 8.0 for whiskerLength. A value is invalid if it is not a number, infinite, non positive, or null.
     * @param whiskerLength the length of the catfish's whisker
     */
    private void setWhiskerLength(double whiskerLength) {
        if ((Double.isNaN(whiskerLength)) || Double.isInfinite(whiskerLength) || whiskerLength <= 0) {
            this.whiskerLength = 8.0;
        } else {
            this.whiskerLength = whiskerLength;
        }
    }
}
