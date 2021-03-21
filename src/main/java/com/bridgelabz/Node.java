package com.bridgelabz;

public class Node<A extends Comparable<A>> {
     public A data;
     public Node<A> left;
     public Node<A> right;

    public Node(A data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}