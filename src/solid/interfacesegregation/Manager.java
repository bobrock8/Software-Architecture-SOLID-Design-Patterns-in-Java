package solid.interfacesegregation;

public class Manager implements IManager {
    @Override
    public void salary() {
        System.out.println("Manager getting the salary ...");
    }

    @Override
    public void hire() {
        System.out.println("Manager hiring new employee ...");
    }

    @Override
    public void train() {
        System.out.println("Manager training new employee ...");
    }

    @Override
    public void addBonus() {
        System.out.println("Manager adding bonus at the end of the year...");
    }
}
