package io.sam.learning.hackerrank;

public class NodeTree {
    NodeTree left, right;
    int data;

    public NodeTree(int data) {
        this.data = data;
        left = right = null;
    }
}