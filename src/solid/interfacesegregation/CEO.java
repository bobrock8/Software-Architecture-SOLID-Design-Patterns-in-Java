package solid.interfacesegregation;

public class CEO implements ICEO {

    @Override
    public void salary() {
        System.out.println("CEO getting the salary ...");
    }

    @Override
    public void makeDecisions() {
        System.out.println("CEO making decisions ...");
    }

    @Override
    public void addStocks() {
        System.out.println("CEO adding stocks ...");
    }

    @Override
    public void addBonus() {
        System.out.println("CEO adding bonuses ...");
    }
}
