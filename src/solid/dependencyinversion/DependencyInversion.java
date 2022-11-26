package solid.dependencyinversion;

public class DependencyInversion {

    public DependencyInversion() {
        WebStore store = new WebStore();
        store.purchaseItem();
    }
}
