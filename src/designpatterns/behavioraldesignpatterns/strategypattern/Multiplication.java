package designpatterns.behavioraldesignpatterns.strategypattern;

public class Multiplication implements Strategy{


    private int num1;
    private int num2;

    public Multiplication(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void execute() {
        System.out.println(num1 * num2);
    }
}
