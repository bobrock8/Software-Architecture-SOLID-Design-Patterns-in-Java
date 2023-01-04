package designpatterns.structrualdesignpatterns.decoratorpattern;

public class DecoratePattern {
    public DecoratePattern() {
        Beverage beverage = new PlainBeverage();
        System.out.println(beverage.getCost());
        System.out.println(beverage.getDescription());

        Beverage beverage2 = new Milk(new Sugar(new PlainBeverage()));
        System.out.println(beverage2.getCost());
        System.out.println(beverage2.getDescription());


    }
}
