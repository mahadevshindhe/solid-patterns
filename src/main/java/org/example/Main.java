package org.example;

public class Main {
    public static void main(String[] args) {
        RotationTree tree = new BalancedTree();

        tree.insert();
        tree.delete();
        tree.traverse();
        tree.leftRotation();
        tree.rightRotation();

    }
}