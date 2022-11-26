package solid.dependencyinversion;

// low level module
public class Payoneer implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paying with Payoneer...");
    }
}
