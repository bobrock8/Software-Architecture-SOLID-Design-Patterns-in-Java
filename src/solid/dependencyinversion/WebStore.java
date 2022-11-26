package solid.dependencyinversion;

// this is the high level module
public class WebStore {

    private final PaymentController controller;

    public WebStore() {
        controller = new PaymentController();
        controller.setPaymentMethod(new PayPal());
    }

    public void purchaseItem() {
        this.controller.pay();
    }
}
