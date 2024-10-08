public class Car {
    private int year;
    private String make;
    private String model;
    private String color;
    private int conditionCategory; // [100. 40]
    private boolean isRestored = false;

    private int checkConditionCategory(int num) {
        if (num <= 100 && num >= 90) {
            System.out.println("Perfect");
            isRestored = true;
        } else if (num <= 89 && num >= 80) {
            System.out.println("Excellent");
        } else if (num <= 79 && num >= 70) {
            System.out.println("Fine");
        } else if (num <= 69 && num >= 60) {
            System.out.println("Very Good");
        } else if (num <= 59 && num >= 50) {
            System.out.println("Good");
        } else if (num <= 49 && num >= 40) {
            System.out.println("Driver");
        } else {
            return checkConditionCategory(80);
        }
        return num;
    }

    // constructor 1
    public Car(int year, String make, String model, String color, int conditionCategory) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.conditionCategory = checkConditionCategory(conditionCategory);
    }

    // constructor 2
    public Car(int year, String make, String model) {
        this(year, make, model, "blue", 80); // call constructor 1
    }

    // constructor 3
    public Car() {
        this(1960, "Jaguar", "E-Type", "silver", 89);
    }

    public int getConditionCategory() {
        return conditionCategory;
    }

    public String carInfo() {
        return color + " " + year + " " + make + " " + model;
    }
}
