package designpatterns.structrualdesignpatterns.adapterpattern;

public class Bus implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bus implements is accelerating...");
    }
}
