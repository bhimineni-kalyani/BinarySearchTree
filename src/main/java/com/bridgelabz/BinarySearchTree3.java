package com.bridgelabz;

public class BinarySearchTree3<A extends Comparable<A>> {

    public void insert(Node<A> root, A data) {
        if(root == null) {
            root = new Node<>(data);
        }
        else if(root.data.compareTo(data) < 0) {
            if(root.right == null) {
                root.right =  new Node<>(data);
                return;
            }
            insert(root.right,data);
        }
        else {
            if(root.left == null) {
                root.left = new Node<>(data);
                return;
            }
            insert(root.left,data);
        }
    }

    public void inOrder(Node<A> root) {
        if(root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public void preOrder(Node<A> root) {
        if(root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void postOrder(Node<A> root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

    public int size(Node<A> root) {
        if(root == null) {
            return 0;
        }
        else {
            return 1 + size(root.left) + size(root.right);
        }
    }

    public boolean search(Node<A> root, A data) {
        if(root == null) {
            return false;
        }
        else if(root.data.compareTo(data) == 0) {
            return true;
        }
        else if(root.data.compareTo(data) < 0) {
            return search(root.right , data);
        }
        else {
            return search(root.left , data);
        }
    }
}