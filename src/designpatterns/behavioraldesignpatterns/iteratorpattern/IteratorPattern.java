package designpatterns.behavioraldesignpatterns.iteratorpattern;

public class IteratorPattern {

    public IteratorPattern() {
        NameRepository repository = new NameRepository();

        for (Iterator iterator = repository.getIterator();iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }


}
