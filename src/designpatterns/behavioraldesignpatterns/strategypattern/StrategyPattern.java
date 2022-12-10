package designpatterns.behavioraldesignpatterns.strategypattern;

public class StrategyPattern {
    // also known as a policy pattern
    public StrategyPattern() {
        OperationManager operationManager = new OperationManager();

        System.out.println("set Addition as a strategy");
        operationManager.setStrategy(new Addition(4, 2));
        operationManager.execute();

        System.out.println("set Multiplication as a strategy");
        operationManager.setStrategy(new Multiplication(1, 3));
        operationManager.execute();

        System.out.println("set Subtraction as a strategy");
        operationManager.setStrategy(new Subtraction(4, 3));
        operationManager.execute();


        System.out.println("set Division" +
                " as a strategy");
        operationManager.setStrategy(new Division(10, 5));
        operationManager.execute();
    }
}
