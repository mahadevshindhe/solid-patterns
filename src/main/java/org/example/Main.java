package org.example;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(10, 5);
        square.draw();

        Shape squareClone = square.cloneObject();
        squareClone.draw();
    }
}