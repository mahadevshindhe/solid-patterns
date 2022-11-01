package org.example;

public class Main {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.LION);
        animal.eat();
    }
}