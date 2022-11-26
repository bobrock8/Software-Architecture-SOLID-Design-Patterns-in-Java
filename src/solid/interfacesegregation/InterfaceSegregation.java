package solid.interfacesegregation;

public class InterfaceSegregation {
    public InterfaceSegregation() {

        CEO ceo = new CEO();
        ceo.salary();
        ceo.makeDecisions();
        ceo.addBonus();
        ceo.addStocks();

        Manager manager = new Manager();
        manager.hire();
        manager.salary();
        manager.train();
        manager.addBonus();

        Employee employee = new Employee();
        employee.salary();
    }
}
