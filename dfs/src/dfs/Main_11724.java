package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bomi on 2019-09-24.
 * 문제 출처 : https://www.acmicpc.net/problem/11724
 */
public class Main_11724 {
    private static boolean[] visited;
    private static int n;
    private static List<Integer>[] vertexes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        vertexes = new List[n+1];
        visited = new boolean[n+1];

        for(int i=1; i<=n; i++) {
            vertexes[i] = new ArrayList<>();
        }

        for(int i=0, u, v; i<m; i++) {
            str = br.readLine().split(" ");
            u = Integer.parseInt(str[0]);
            v = Integer.parseInt(str[1]);

            vertexes[u].add(v);
            vertexes[v].add(u);
        }

        int count = 0;
        for(int i=1; i<=n; i++) {
            if(!visited[i]) {
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    private static void DFS(int start) {
        visited[start] = true;
        for(int vertex : vertexes[start]) {
            if(!visited[vertex]) {
                DFS(vertex);
            }
        }
    }
}
