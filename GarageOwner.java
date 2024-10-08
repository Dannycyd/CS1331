public class GarageOwner {
    private String name;
    private int age;
    private int carsOwned = 0;

    public GarageOwner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void addCar() {
        carsOwned++;
    }

    public void minusCar() {
        carsOwned--;
    }

    public int getCarsOwned() {
        return carsOwned;
    }

}
