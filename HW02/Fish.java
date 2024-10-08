/**
 * A Fish super class.
 * @author danny_cyd
 * @version October 7, 2024.
 */
public class Fish {

    protected final String name;
    protected Double length; // in inches
    protected Double weight; // in ounces
    private static int totalFish;

    /**
     * A class constructor with three parameters.
     * @param name   the name of the fish
     * @param length the end-to-end length of the fish in inches
     * @param weight the weight of the fish in ounces
     */
    public Fish(String name, Double length, Double weight) {
        if (name.equals(null) || name.equals("") || name.isEmpty()) { // if not valid input name
            this.name = "Nemo";
        } else {
            this.name = name;
        }

        if ((Double.isNaN(length)) || Double.isInfinite(length) || length <= 0) { // if not valid input length
            this.length = 8.0;
        } else {
            this.length = length;
        }

        if ((Double.isNaN(weight)) || Double.isInfinite(weight) || weight <= 0) { // if not valid input weight
            this.weight = 2.0;
        } else {
            this.weight = weight;
        }
        ++totalFish;
    }

    /**
     * A constructor with no parameters.
     */
    public Fish() {
        this("Nemo", 5.0, 12.0);
    }

    /**
     * A deep copy constructor with the another Fish object as parameter.
     * @param otherFish another Fish from which we want to deep copy
     */
    public Fish(Fish otherFish) {
        this(otherFish.name, otherFish.length, otherFish.weight);
    }


    /**
     * A public method that gives the length of the fish.
     * @return Returns the end-to-end length of this fish as a String, formatted precisely as "... ft ... in"
     * All decimal numbers are displayed to 2 decimal place with rounding
     */
    public String formatLength() {
        int fishFt = this.length.intValue() / 12;
        double fishIn = this.length % 12;
        String printStr = "%d ft %.2f in";
        return String.format(printStr, fishFt, fishIn);
    }

    /**
     * A public method that gives the weight of the fish.
     * @return Returns the weight of this fish as a String, formatted precisely as  "... lbs ... oz"
     * If the weight of this fish includes only one pound, the unit should instead be “lb”
     * All decimal numbers are displayed to 2 decimal place with rounding
     */
    public String formatWeight() {
        int fishPd = this.weight.intValue() / 16;
        double fishOz = this.weight % 16;
        String printStr;
        if (fishPd == 1) {
            printStr = "%d lb %.2f oz";
        } else {
            printStr = "%d lbs %.2f oz";
        }

        return String.format(printStr, fishPd, fishOz);
    }

    /**
     * Overrides the corresponding method in the object super class, such that a String is returned.
     * @return Returns a detailed description of the fish, including its key instance variables
     * such as its name, its length, and its weight.
     */
    public String toString() {
        String printStr = "I'm a talking fish named %s. My length is %s and my weight is %s.";
        return String.format(printStr, this.name, formatLength(), formatWeight());
    }
}
