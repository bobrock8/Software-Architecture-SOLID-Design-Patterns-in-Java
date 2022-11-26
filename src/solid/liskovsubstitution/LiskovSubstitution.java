package solid.liskovsubstitution;

public class LiskovSubstitution {
    public LiskovSubstitution() {
        Vehicle petrolCar = new PetrolCar("Nissan", 5);
        petrolCar.fuel();
        petrolCar.speedUp();
        petrolCar.slowDown();

        Vehicle electricCar = new ElectricCar("Tesla", 1);

        electricCar.slowDown();
        electricCar.speedUp();
        electricCar.fuel();
    }
}
