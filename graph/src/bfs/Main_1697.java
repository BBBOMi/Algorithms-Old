package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-10-26.
 * 문제 출처 : https://www.acmicpc.net/problem/1697
 *
 * 시간 복잡도 : O(N)
 * 사용한 알고리즘 : BFS(너비 우선 탐색)
 * 사용한 자료구조 : 배열, 큐
 */
public class Main_1697 {
    static class Location {
        int point;
        int distance;

        public Location(int point) {
            this.point = point;
            this.distance = 0;
        }

        public Location(int point, int distance) {
            this.point = point;
            this.distance = distance;
        }
    }

    private static boolean[] visited = new boolean[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 수빈이가 있는 위치
        int k = Integer.parseInt(st.nextToken()); // 동생이 있는 위치

        int result = bfs(n, k);
        System.out.println(result);
    }

    private static int bfs(int n, int k) {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(n));

        while(!queue.isEmpty()) {
            Location x = queue.poll();
            visited[x.point] = true;

            if(x.point == k) {
                return x.distance;
            }

            if(x.point > 0 && !visited[x.point-1]) {
                queue.offer(new Location(x.point-1, x.distance+1));
            }

            if(x.point < 100000 && !visited[x.point+1]) {
                queue.offer(new Location(x.point+1, x.distance+1));
            }

            if(x.point <= 50000 && !visited[x.point*2]) {
                queue.offer(new Location(x.point*2, x.distance+1));
            }
        }
        return -1;
    }
}
