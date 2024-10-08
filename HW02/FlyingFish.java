import java.util.Random;
/**
 * A Flying Fish subclass that extends the Fish superclass.
 * @author danny_cyd
 * @version October 7, 2024.
 */
public class FlyingFish extends Fish {

    private int flightTime;

    /**
     * A constructor with four parameters.
     *
     * The following three parameters are same in the Fish constructor and are thus called into the super method
     * @param name   the name of the flying fish
     * @param length the end-to-end length of the flying fish in inches
     * @param weight the weight of the flying fish in ounces
     *
     * This following parameter is an instance variable specific to flying fish
     * @param flightTime the amount of time a flying fish can stay in the air in seconds. An invalid value
     *                   should default this field to 30. A value is invalid if it is non-positive.
     */
    public FlyingFish(String name, Double length, Double weight, int flightTime) {
        super(name, length, weight);
        if (flightTime <= 0) {
            this.flightTime = 30;
        } else {
            this.flightTime = flightTime;
        }
    }

    /**
     * A constructor that takes in no parameters.
     */
    public FlyingFish() {
        this("Gilbert", 12.0, 24.0, 36);
    }

    /**
     * A deep copy constructor with the another FlyingFish object as parameter.
     * @param otherStripedBass another CatFish from which we want to deep copy
     */
    public FlyingFish(FlyingFish otherStripedBass) {
        this(otherStripedBass.name, otherStripedBass.length, otherStripedBass.weight, otherStripedBass.flightTime);
    }

    /**
     * @return Returns this flying fish’s power, represented as a double.
     * A flying fish’s power is the product of its weight and flight time.
     */
    public double calculatePower() {
        return this.weight * this.flightTime;
    }

    /**
     * Prints a message showing the flying fish's name and its flying time.
     */
    public void fly() {
        Random rand = new Random();
        double time = (1 - rand.nextDouble()) * this.flightTime;
        System.out.printf("Woohoo! %s flew for %.2f seconds.\n", this.name, this.flightTime);
    }

    /**
     * Overrides the corresponding method in the Fish super class, such that a Flying Fish specific String is returned.
     * @return Returns a detailed description of the Flying Fish, including its key instance variables
     * such as its name, its length, its weight, its flight time record, and its power.
     */
    public String toString() {
        String printStr = "%s I'm a flying fish, and my flight time record is %d, so my power is %.2f.";
        return String.format(printStr, super.toString(), this.flightTime, calculatePower());
    }
}
