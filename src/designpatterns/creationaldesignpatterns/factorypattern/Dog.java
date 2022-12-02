package designpatterns.creationaldesignpatterns.factorypattern;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats meats...");
    }
}
