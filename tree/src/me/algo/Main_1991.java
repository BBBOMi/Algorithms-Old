package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1991 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Tree tree = new Tree();

        for(int i=0; i<n; i++) {
            String[] str = br.readLine().split(" ");
            tree.add(str[0], str[1], str[2]);
        }
    }
}

class Node {
    Node left;
    Node right;
    String value;

    public Node() {

    }

    public Node(String v) {
        this.value = v;
    }
//
//    public Node(String v, Node l, Node r) {
//        this.left = l;
//        this.right = r;
//        this.value = v;
//    }
}

class Tree {
    private Node root = null;
    private Node head = root;
    Node newNode;

    public void add(String v, String l, String r) {
        newNode = new Node(v);
        if(this.root == null) {
            this.root = newNode;
            head = newNode;
        } else {
            Node temp = search(v);
            if(temp != null) {
                head = temp;
            } else {
                head = newNode;
            }
        }

        if(".".equals(l) && ".".equals(r)) {
            head.left = null;
            head.right = null;
        } else if(".".equals(l) || ".".equals(r)) {
            if(".".equals(l)) {
                head.left = null;
                head.right = new Node(r);
            } else {
                head.right = new Node(l);
                head.right = null;
            }
        } else {
            head.left = new Node(l);
            head.right = new Node(r);
        }
    }

//    public Node search(String v) {
//        if(v.equals(head.value)) {
//            return head;
//        } else {
//            search()
//        }
//    }
}
