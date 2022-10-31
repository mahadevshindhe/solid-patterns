package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new PetrolCar("Toyota", 3);

        v.speedUp();
        v.slowDown();
        v.fuel();
    }
}