package org.example;

public class Main {
    public static void main(String[] args) {
        OperationManagerBAD manager = new OperationManagerBAD();
        manager.execute(new Multiplication(), 10, 5);
    }
}