package io.sam.learning.hackerrank;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesLinkedList {

    public static NodeTraversal removeDuplicates(NodeTraversal head) {
        //Write your code here
        Set<Integer> traversalSet = new TreeSet<> ( );
        while (head != null) {
            traversalSet.add (head.data);
            head = head.next;
        }
        head = null;
        for (Integer integer : traversalSet) {
            head = insert (head, integer);
        }
        return head;
    }

    public static NodeTraversal insert(NodeTraversal head, int data) {
        NodeTraversal p = new NodeTraversal (data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            NodeTraversal start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(NodeTraversal head) {
        NodeTraversal start = head;
        while (start != null) {
            System.out.print (start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        NodeTraversal head = null;
        int T = sc.nextInt ( );
        while (T-- > 0) {
            int ele = sc.nextInt ( );
            head = insert (head, ele);
        }
        head = removeDuplicates (head);
        display (head);

    }
}