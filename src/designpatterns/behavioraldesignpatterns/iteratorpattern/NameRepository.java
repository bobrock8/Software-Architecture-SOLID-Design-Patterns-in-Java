package designpatterns.behavioraldesignpatterns.iteratorpattern;

public class NameRepository {

    private String[] names = {
            "Adam",
            "Ana",
            "Kevin",
            "Michael",
            "Frank",
    };

    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
