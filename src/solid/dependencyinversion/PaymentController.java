package solid.dependencyinversion;


// this is the pure abstract layer
public class PaymentController {

    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay() {
        this.paymentMethod.pay();
    }
}
