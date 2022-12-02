package designpatterns.creationaldesignpatterns.abstractfactorypattern;

public class ElectricCarFactory implements AbstractFactory {

    private ElectricCarFactory(){}

    @Override
    public Car getCar(String type) {
        return null;
    }
}
