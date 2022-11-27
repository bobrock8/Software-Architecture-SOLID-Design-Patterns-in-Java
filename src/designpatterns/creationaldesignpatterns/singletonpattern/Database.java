package designpatterns.creationaldesignpatterns.singletonpattern;

public enum Database {

    // thread safe by default
    INSTANCE_OF_DATABASE;

    public void connect() {
        System.out.println("Connecting to the DB...");
    }

    public void disconnect() {
        System.out.println("Disconnecting...");
    }
}
