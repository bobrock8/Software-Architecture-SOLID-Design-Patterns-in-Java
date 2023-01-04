package designpatterns.behavioraldesignpatterns.nullobjectpattern;

public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String get() {
        return "The customer doesn't exist";
    }
}
