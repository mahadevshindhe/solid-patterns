package org.example;

public class Main {
    public static void main(String[] args) {

        Pair pair = InputProcess.process();

        if (!ViolationChecker.isValid(pair)) {
            System.out.println("invalid input");
            return;
        }

        int firstInteger = Integer.parseInt(pair.getFirst());
        int secondInteger = Integer.parseInt(pair.getSecond());

        int result = Operation.execute(firstInteger, secondInteger);

        System.out.println(result);
    }
}
