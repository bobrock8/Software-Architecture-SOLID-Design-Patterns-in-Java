package designpatterns.behavioraldesignpatterns.nullobjectpattern;

public class NullObjectPattern
{
    public NullObjectPattern() {
        CustomerFactory customerFactory = new CustomerFactory();
        System.out.println(customerFactory.getCustomer("Joe").get());
        System.out.println(customerFactory.getCustomer("Ana").get());
        System.out.println(customerFactory.getCustomer("Aca").get());
    }
}
