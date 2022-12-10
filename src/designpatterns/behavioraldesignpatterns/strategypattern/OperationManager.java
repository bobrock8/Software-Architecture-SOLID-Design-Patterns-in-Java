package designpatterns.behavioraldesignpatterns.strategypattern;

// abstract layer between the high and low level modules
public class OperationManager {

    // we have to use composition
    // BECAUSE THE BEHAVIOR CAN BE CHANGED AT RUN TIME
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        this.strategy.execute();
    }
}
