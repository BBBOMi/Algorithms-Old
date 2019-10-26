package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-10-26.
 * 문제 출처 : https://www.acmicpc.net/problem/13549
 *
 * 시간 복잡도 : O(N^2)
 * 사용한 알고리즘 : BFS(너비 우선 탐색)
 * 사용한 자료구조 : 배열, 큐
 */
public class Main_13549 {
    private static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Arrays.fill(visited, -1);

        bfs(n, k);

        System.out.println(visited[k]);
    }

    private static void bfs(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        visited[n] = 0;

        while(!queue.isEmpty()) {
            int x = queue.poll();

            if(x == k) {
                return;
            }

            if(x > 0) {
                int point = visited[x-1];
                if(point == -1 || point > visited[x] + 1) {
                    queue.offer(x-1);
                    visited[x-1] = visited[x] + 1;
                }
            }

            if(x < 100000) {
                int point = visited[x+1];
                if(point == -1 || point > visited[x] + 1) {
                    queue.offer(x+1);
                    visited[x+1] = visited[x] + 1;
                }
            }

            if(x < 50001) {
                int point = visited[x*2];
                if(point == -1 || point > visited[x]) {
                    queue.offer(x*2);
                    visited[x*2] = visited[x];
                }
            }
        }
    }
}
