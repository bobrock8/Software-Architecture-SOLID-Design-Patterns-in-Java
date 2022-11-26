package solid.dependencyinversion;

// low level module
public class Skrill implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paying with Skrill...");
    }
}
