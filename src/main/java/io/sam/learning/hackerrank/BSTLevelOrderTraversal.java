package io.sam.learning.hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BSTLevelOrderTraversal {

    static void levelOrder(NodeTree root) {
        //Write your code here
        Queue<NodeTree> queue = new LinkedList<> ( );
        queue.add (root);
        while (!queue.isEmpty ( )) {
            NodeTree NodeTree = queue.poll ( );
            System.out.print (NodeTree.data + " ");
            if (NodeTree.left != null)
                queue.add (NodeTree.left);
            if (NodeTree.right != null)
                queue.add (NodeTree.right);
        }
    }

    public static NodeTree insert(NodeTree root, int data) {
        if (root == null) {
            return new NodeTree (data);
        } else {
            NodeTree cur;
            if (data <= root.data) {
                cur = insert (root.left, data);
                root.left = cur;
            } else {
                cur = insert (root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt ( );
        NodeTree root = null;
        while (T-- > 0) {
            int data = sc.nextInt ( );
            root = insert (root, data);
        }
        levelOrder (root);
    }
}
