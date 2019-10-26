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
 * 문제 출처 : https://www.acmicpc.net/problem/1697
 *
 * Main_1697를 개선(시간, 메모리)
 *
 * 시간 복잡도 : O(N)
 * 사용한 알고리즘 : BFS(너비 우선 탐색)
 * 사용한 자료구조 : 배열, 큐
 */
public class Main_1697b {
    private static int[] distances = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 수빈이가 있는 위치
        int k = Integer.parseInt(st.nextToken()); // 동생이 있는 위치

        Arrays.fill(distances, -1);

        int result = bfs(n, k);
        System.out.println(result);
    }

    private static int bfs(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        distances[n] = 0;

        while(!queue.isEmpty()) {
            int x = queue.poll();

            if(x == k) {
                return distances[x];
            }

            if(x > 0 && distances[x-1] == -1) {
                queue.offer(x-1);
                distances[x-1] = distances[x]+1;
            }

            if(x < 100000 && distances[x+1] == -1) {
                queue.offer(x+1);
                distances[x+1] = distances[x]+1;
            }

            if(x <= 50000 && distances[x*2] == -1) {
                queue.offer(x*2);
                distances[x*2] = distances[x]+1;
            }
        }
        return -1;
    }
}
