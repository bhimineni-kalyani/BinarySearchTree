package com.bridgelabz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTreetest1 {
    BinarySearchTree1<Integer> tree;
    Node<Integer> root;

    @BeforeEach
    public void setUp() {
        tree = new BinarySearchTree1<>();
        root = new Node<>(56);
        tree.insert(root, 30);
        tree.insert(root, 70);
        tree.insert(root, 23);
        tree.insert(root, 28);
        tree.insert(root, 38);
        tree.insert(root, 83);
        tree.insert(root, 19);
        tree.insert(root, 32);
        tree.insert(root, 03);
        tree.insert(root, 22);
        tree.insert(root, 06);
        tree.insert(root, 01);
    }

    @Test
    public void insert() {
        tree.insert(root, 56);
        tree.insert(root, 30);
        tree.insert(root, 23);
        tree.insert(root, 28);
        tree.insert(root, 38);
        tree.insert(root, 83);
        tree.insert(root, 19);
        tree.insert(root, 32);
        tree.insert(root, 03);
        tree.insert(root, 22);
        tree.insert(root, 06);
        tree.insert(root, 01);
    }

    @Test
    public void inOrder() {
        System.out.println("---");
        tree.inOrder(root);
    }

    @Test
    public void preOrder() {
        System.out.println("---");
        tree.preOrder(root);
    }

    @Test
    public void postOrder() {
        System.out.println("---");
        tree.postOrder(root);
    }
}