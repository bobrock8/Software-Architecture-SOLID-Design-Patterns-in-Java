package designpatterns.behavioraldesignpatterns.nullobjectpattern;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<String> customerName;

    public Database() {
        this.customerName = new ArrayList<>();
        this.customerName.add("Adam");
        this.customerName.add("Ana");
        this.customerName.add("Joe");
        this.customerName.add("Michael");
        this.customerName.add("Daniel");
    }

    public boolean exist (String name) {
        for (String customer: customerName)
            if (customer.equals(name))
                return true;
        return false;
    }
}
