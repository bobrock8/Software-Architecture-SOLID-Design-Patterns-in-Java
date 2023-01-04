package designpatterns.structrualdesignpatterns.decoratorpattern;

public class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost() + 4;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Sugar";
    }
}
