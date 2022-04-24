/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.tree;

public class Node<T> {
    private final T value;
    private Node<T> left;
    private Node<T> right;

    public Node(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public static <T> Node<T> with(T value, Node<T> left, Node<T> right) {
        Node<T> node = new Node<>(value);
        node.setLeft(left);
        node.setRight(right);
        return node;
    }

    public static <T> Node<T> with(T value) {
        return new Node<>(value);
    }

}
