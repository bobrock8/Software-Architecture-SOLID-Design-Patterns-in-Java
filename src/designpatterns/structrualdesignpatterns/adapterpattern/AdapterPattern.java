package designpatterns.structrualdesignpatterns.adapterpattern;

public class AdapterPattern {
    public AdapterPattern() {
        Vehicle bus = new Bus();
        Vehicle car = new Car();
        Vehicle bicycle = new BicycleAdapter(new Bicycle());

        bus.accelerate();
        car.accelerate();
        bicycle.accelerate();
    }
}
