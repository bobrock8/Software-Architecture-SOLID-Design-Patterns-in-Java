package solid.interfacesegregation;

public class Employee implements IEmployee{
    @Override
    public void salary() {
        System.out.println("Employee getting the salary ...");
    }
}
