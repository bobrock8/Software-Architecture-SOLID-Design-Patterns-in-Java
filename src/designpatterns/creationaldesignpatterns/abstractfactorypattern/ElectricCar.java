package designpatterns.creationaldesignpatterns.abstractfactorypattern;

public class ElectricCar implements Car {

    protected String type;
    protected int year;

    public ElectricCar(String type, int year) {
        this.type = type;
        this.year = year;
    }

    @Override
    public void speedUp() {
        System.out.println("Electric car " + type + " speeding up...");
    }

    @Override
    public void slowDown() {
        System.out.println("Electric car " + type + " slowing down...");
    }

    @Override
    public void engine() {
        System.out.println("Electric car " + type + " ,time for charging...");
    }
}
