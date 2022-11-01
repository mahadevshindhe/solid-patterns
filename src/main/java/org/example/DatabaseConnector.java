package org.example;

public class DatabaseConnector {

    private static DatabaseConnector INSTANCE;

    private DatabaseConnector() {

    }

    public static DatabaseConnector getInstance() {
        if (INSTANCE == null) {
            synchronized (DatabaseConnector.class) {
                INSTANCE = new DatabaseConnector();
            }
        }
        return INSTANCE;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting...");
    }
}
