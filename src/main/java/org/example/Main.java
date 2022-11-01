package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("Kevin", "kevin@gmail.com").build();
        System.out.println(person);
    }
}