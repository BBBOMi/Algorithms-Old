package me.algo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bomi on 2019-09-02.
 */
public class Main_11725 {
    private static List<Integer>[] nodes;
    private static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        parents = new int[n+1];
        nodes = new List[n+1];

        for(int i=1, node1, node2; i<n; i++) {
            String[] edge = br.readLine().split(" ");
            node1 = Integer.parseInt(edge[0]);
            node2 = Integer.parseInt(edge[1]);

            if(nodes[node1] == null) nodes[node1] = new ArrayList<>();
            if(nodes[node2] == null) nodes[node2] = new ArrayList<>();

            nodes[node1].add(node2);
            nodes[node2].add(node1);
        }

        findParent(1, 0);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=2; i<=n; i++) {
            bw.write(parents[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void findParent(int start, int parent) {
        parents[start] = parent;
        for(int i : nodes[start]) {
            if(i != parent) {
                findParent(i, start);
            }
        }
    }
}
