package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by bomi on 2018-12-05.
 */

public class Main_1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int v = Integer.parseInt(str[2]);

        Node[] heads = new Node[n+1];
        for(int i=1; i<=n; i++) {
            heads[i] = new Node(i);
        }

        for(int i=0; i<m; i++) {
            String[] edges = br.readLine().split(" ");
            int v1 = Integer.parseInt(edges[0]);
            int v2 = Integer.parseInt(edges[1]);

            add(heads[v1], v2);
            add(heads[v2], v1);
        }

        // test print
        for(int i=1; i<heads.length; i++) {
            heads[i].print();
        }



    }

    static void add(Node from, int to) {
        Node newNode = new Node(to);
        newNode.link = from;
        from = newNode;
    }

    static void dfs(Node[] nodes, int n, int v) {
        Stack<Node> s = new Stack<>();
        boolean[] visited = new boolean[n+1];
        Node newNode = new Node();

        s.push(nodes[v]);
        visited[v] = true;

        while(!s.empty()) {
            newNode = nodes[v];
            while(newNode != null) {
                if(!visited[newNode.data]) {
                    s.push(newNode);
                    visited[newNode.data] = true;
                    System.out.print(newNode + " ");
                    newNode = nodes[newNode.data];
                } else {
                    newNode = newNode.link;
                }
                // pop
            }

            s.push(nodes[newNode.data]);
        }
    }

    static void bfs(Node[] nodes) {

    }
}

class Node {
    int data;
    Node link;

    Node(){}
    Node(int data) {
        this.data = data;
        this.link = null;
    }

    void print() {
        Node head = this;
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.link;
        }
        System.out.println();
    }
}
