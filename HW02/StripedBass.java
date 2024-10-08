/**
 * A Striped Bass subclass that extends the Fish superclass.
 * @author danny_cyd
 * @version October 7, 2024.
 */
public class StripedBass extends Fish {

    private int stripeCount;
    private boolean isSaltwater;
    private Catfish bestFriend;

    /**
     * A constructor with six parameters.
     *
     * The following three parameters are same in the Fish constructor and are thus called into the super method
     * @param name   the name of the catfish
     * @param length the end-to-end length of the catfish in inches
     * @param weight the weight of the catfish in ounces
     *
     * This following parameter is an instance variable specific to Striped Bass
     * @param stripeCount the count of all stripes on this striped bass. An invalid value should default
     *                    this field to 25. A value is invalid if it is non-positive.
     * @param isSaltwater whether this striped bass resides in a saltwater body
     * @param bestFriend  a catfish who is the best friend of this striped bass
     */
    public StripedBass(String name, Double length, Double weight, int stripeCount,
                       boolean isSaltwater, Catfish bestFriend) {
        super(name, length, weight);
        if (stripeCount <= 0) {
            this.stripeCount = 25;
        } else {
            this.stripeCount = stripeCount;
        }

        this.isSaltwater = isSaltwater;
        this.bestFriend = new Catfish(bestFriend);
    }

    /**
     * A constructor that takes in no parameters.
     */
    public StripedBass() {
        this("Striper", 30.0, 320.0, 14, false, null);
    }

    /**
     * A deep copy constructor with the another Striped Bass object as parameter.
     * @param otherStripedBass another Striped Bass from which we want to deep copy
     */
    public StripedBass(StripedBass otherStripedBass) {
        this(otherStripedBass.name, otherStripedBass.length, otherStripedBass.weight, otherStripedBass.stripeCount,
                otherStripedBass.isSaltwater, otherStripedBass.bestFriend);
    }

    /**
     * A method that let the Striped Bass moves to the opposite kind of water body if and only if it does not have
     * a best friend.
     */
    public void migrate() {
        if (bestFriend == null) {
            this.isSaltwater = !(this.isSaltwater);
        }
    }

    /**
     * Overrides the corresponding method in the Fish super class, such that a Striped bass specific String is returned.
     * @return Returns a detailed description of the Striped bass, including its key instance variables
     * such as its name, its length, its weight, whether it resides in saltwater, its stripe counts,
     * whether it has a best friend, and the name of its best friend.
     */
    public String toString() {
        String printStr = "%s I'm a %s striped bass with %d stripes. "
                + "I have {no best friend/a best friend named <bestFriendName>}.";
        return String.format(printStr, super.toString(),
                this.isSaltwater ? "saltwater" : "freshwater", this.stripeCount,
                this.bestFriend == null ? "no best friend" : "a best friend named " + bestFriend.name + ".");
    }


}
