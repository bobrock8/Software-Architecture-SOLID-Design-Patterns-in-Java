package designpatterns.creationaldesignpatterns.singletonpattern;

public class DatabaseConnector {

    private static DatabaseConnector databaseConnector;

    // cannot instantiate class
    private DatabaseConnector() {

    }

    public static DatabaseConnector getDatabaseConnector() {

        // if we have multiple threads ???
        if (databaseConnector == null) {

            // this block can be entered by a single thread
            // PROBLEM: it is too slow
            synchronized (DatabaseConnector.class) {
                databaseConnector = new DatabaseConnector();
            }
        }

        return databaseConnector;
    }

    public void connect() {
        System.out.println("Connecting to the DB...");
    }

    public void disconnect() {
        System.out.println("Disconnecting...");
    }
}
