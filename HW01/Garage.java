public class Garage {
    private GarageOwner theOwner;
    private Car[] carCatalogue;

    // constructor 1
    public Garage(GarageOwner theOwner, Car[] carCatalogue) {
        this.theOwner = theOwner;
        this.carCatalogue = carCatalogue;
    }

    // constructor 2
    public Garage() {
        this(new GarageOwner("Enzo Ferrari", 35), new Car[4]);
    }

    public Car addCar(int index, Car newCar) {
        if (index >= carCatalogue.length || index < 0 || newCar == null) {
            // if the index is invalid(out of bound) or car is null
            System.out.println("Cannot add a car to this spot");
            return null;
        }

        if (this.carCatalogue[index] != null) {  // if there's no car at the index position
            Car prevCar = this.carCatalogue[index];
            this.carCatalogue[index] = newCar;
            System.out.println("There was a " + prevCar.carInfo() + " here before.");
            return prevCar;
        } else { // if there's car at the index position
            this.carCatalogue[index] = newCar;
            System.out.println("A " + newCar.carInfo() + " was just parked here.");
            theOwner.addCar();
            return null;
        }
    }

    public Car sellCar(int index) {
        if (index >= carCatalogue.length || index < 0 || this.carCatalogue[index] == null) {
            // if the index is invalid(out of bound) or car is null
            System.out.println("There was no car to sell");
            return null;
        } else {
            Car soldCar = this.carCatalogue[index];
            this.carCatalogue[index] = null;
            System.out.println(theOwner.getName() + " just sold a " + soldCar.carInfo() + ".");
            theOwner.minusCar();
            return soldCar;
        }
    }

    public void showCertainCars(int conditionCategory) {
        for (Car a : carCatalogue) {
            if (a != null && (a.getConditionCategory() > conditionCategory)) {
                System.out.println("A " + a.carInfo() + " with a condition category of "
                        + a.getConditionCategory() + ".");
            }
        }
    }
}