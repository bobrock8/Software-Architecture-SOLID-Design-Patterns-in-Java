package designpatterns.creationaldesignpatterns.factorypattern;

public class FactoryPattern {
    public FactoryPattern() {
        Animal cat = AnimalFactory.getAnimal(AnimalType.CAT);
        if (cat != null)
            cat.eat();
    }
}
