package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTreetest3{
    BinarySearchTree3<Integer> tree;
    Node<Integer> root;

    @BeforeEach
    public void setUp() {
        tree = new BinarySearchTree3<>();
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
        tree.insert(root, 63);
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

    @Test
    public void testSize() {
        Assertions.assertEquals(13, tree.size(root));
        System.out.println("match");
    }

    @Test
    public void testSearch_true() {
        Assertions.assertEquals(true, tree.search(root, 63));
        System.out.println("Right");
    }

    @Test
    public void testSearch_false() {
        Assertions.assertEquals(false, tree.search(root, 100));
        System.out.println("Wrong");
    }
}