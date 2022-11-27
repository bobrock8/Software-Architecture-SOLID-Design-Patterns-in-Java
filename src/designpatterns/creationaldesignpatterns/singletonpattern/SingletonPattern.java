package designpatterns.creationaldesignpatterns.singletonpattern;

public class SingletonPattern {
    public SingletonPattern() {

        DatabaseConnector obj1 = DatabaseConnector.getDatabaseConnector();
        DatabaseConnector obj2 = DatabaseConnector.getDatabaseConnector();

        if (obj1 == obj2)
            System.out.println("Instances are the same!");

        DatabaseConnector.getDatabaseConnector().connect();
        DatabaseConnector.getDatabaseConnector().disconnect();


        Database.INSTANCE_OF_DATABASE.connect();
        Database.INSTANCE_OF_DATABASE.disconnect();


        Database database1 = Database.INSTANCE_OF_DATABASE;
        Database database2 = Database.INSTANCE_OF_DATABASE;

        if (database1 == database2)
            System.out.println("Instances are the same!");
    }
}
