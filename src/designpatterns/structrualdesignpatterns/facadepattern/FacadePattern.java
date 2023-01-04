package designpatterns.structrualdesignpatterns.facadepattern;

public class FacadePattern {
    public FacadePattern() {
        SortingManager manager = new SortingManager();
        manager.doBubbleSort();
    }
}
