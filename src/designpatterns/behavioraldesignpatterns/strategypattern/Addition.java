package designpatterns.behavioraldesignpatterns.strategypattern;

public class Addition implements Strategy{

    private int num1;
    private int num2;

    public Addition(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void execute() {
        System.out.println(num1 + num2);
    }
}
