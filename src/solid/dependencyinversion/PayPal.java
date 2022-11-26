package solid.dependencyinversion;

// low level module
public class PayPal implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paying with PayPal...");
    }
}
