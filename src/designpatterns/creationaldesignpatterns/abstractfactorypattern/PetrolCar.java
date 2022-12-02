package designpatterns.creationaldesignpatterns.abstractfactorypattern;

public class PetrolCar implements Car {

    protected String type;
    protected int year;

    public PetrolCar(String type, int year) {
        this.type = type;
        this.year = year;
    }

    @Override
    public void speedUp() {
        System.out.println("Petrol car " + type + " speeding up...");
    }

    @Override
    public void slowDown() {
        System.out.println("Petrol car " + type + " slowing down...");
    }

    @Override
    public void engine() {
        System.out.println("Petrol car " + type + " ,time for fuel...");
    }
}
