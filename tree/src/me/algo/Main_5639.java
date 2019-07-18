package me.algo;

import java.io.*;

/**
 * Created by bomi on 2019-07-16.
 */

public class Main_5639 {
    static class Node {
        int value;
        Node left;
        Node right;

        Node() {
            this.value = 0;
            this.left = null;
            this.right = null;
        }

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        private Node makeTree(Node node, int value) {
            Node current = null;
            if(node == null || node.value == 0) return new Node(value);
            if(node.value > value) {
                current = makeTree(node.left, value);
                node.left = current;
            } else if(node.value < value){
                current = makeTree(node.right, value);
                node.right = current;
            }
            return node;
        }

        private void postOrder() throws IOException {
            if(left != null) left.postOrder();
            if(right != null) right.postOrder();
            bw.write(value + "\n");
        }
  }

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Node tree = new Node();
        String string;
        while((string = br.readLine()) != null && !string.isEmpty()) {
            tree = tree.makeTree(tree, Integer.parseInt(string));
        }

        tree.postOrder();
        bw.close();
        br.close();
    }
}
