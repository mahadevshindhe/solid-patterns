package org.example;public class Main {
    public static void main(String[] args) {
        DatabaseController controller = new DatabaseController(new OracleDatabase());
        controller.connect();
        controller.disconnect();
    }
}