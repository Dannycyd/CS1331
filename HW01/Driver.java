public class Driver {
    public static void main(String[] args) {
        GarageOwner danny = new GarageOwner("Danny", 19);
        Garage myGarage = new Garage(danny, new Car[3]);
        myGarage.addCar(0, new Car(1998, "Tesla", "modelY", "white", 30));
        myGarage.addCar(1, new Car(2007, "Mercedes-Benz", "GLA"));
        myGarage.addCar(2, new Car());
        myGarage.sellCar(1);
        System.out.println("Danny has " + danny.getCarsOwned() + " cars.");
        myGarage.showCertainCars(85);
    }
}
