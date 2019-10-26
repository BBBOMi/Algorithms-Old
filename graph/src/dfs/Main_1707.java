package dfs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-10-26.
 * 문제 출처 : https://www.acmicpc.net/problem/1707
 *
 * 시간 복잡도 : O(N^2)
 * 공간 복잡도 : O(N^2)
 * 사용한 알고리즘 : DFS(깊이 우선 탐색)
 * 사용한 자료구조 : 배열
 */
public class Main_1707 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static  List<Integer>[] graph;
    private static int[] colors; // 0: 방문 안함, 1: 색1, 2: 색2

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(br.readLine());

        for(int i=0, v, e; i<k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            v = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());

            makeGraph(v, e);
            colors = new int[v+1]; // graph와 같은 크기

            for(int j=1; j<graph.length; j++) {
                if(colors[j] == 0) {
                    dfs(j, 1);
                }
            }

            if(checkBipartite()) {
                sb.append("YES \n");
                continue;
            }

            sb.append("NO \n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());

        bw.close();
        br.close();
    }

    private static void makeGraph(int v, int e) throws IOException {
        graph = new List[v+1];

        for(int i=1; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        makeEdge(e);
    }

    private static void makeEdge(int e) throws IOException {
        for(int i=0; i<e; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            graph[v1].add(v2);
            graph[v2].add(v1);
        }
    }

    private static void dfs(int start, int color) {
        colors[start] = color;
        for(int vertex : graph[start]) {
            if(colors[vertex] == 0 ) {
                dfs(vertex, 3 - color);
            }
        }
    }

    private static boolean checkBipartite() {
        for(int i=1; i<graph.length; i++) {
            int color = colors[i];
            for(int vertex : graph[i]) {
                if(color == colors[vertex]) {
                    return false;
                }
            }
        }
        return true;
    }
}
