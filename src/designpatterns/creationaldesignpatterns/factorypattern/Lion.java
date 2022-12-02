package designpatterns.creationaldesignpatterns.factorypattern;

public class Lion implements Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats everything...");
    }
}
