package dfs;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-10-08.
 * 문제 출처 : https://www.acmicpc.net/problem/4963
 *
 * 시간 복잡도 : O(N)
 * 공간 복잡도 : O(N)
 * 사용한 알고리즘 : DFS
 * 사용한 자료구조 : 배열
 */
public class Main_4963 {
    private static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    private static int[] dy = {1 ,1, 0, -1, -1, -1, 0, 1};

    private static int h;
    private static int w;

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(StringTokenizer st = new StringTokenizer(br.readLine()); ; st = new StringTokenizer(br.readLine())) {
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if(h == 0 && w == 0) {
                bw.flush();
                bw.close();
                br.close();
                return;
            }

            int[][] map = makeArray();
            int count = findIsland(map);
            bw.write(count + "\n");
        }
    }

    private static int[][] makeArray() throws IOException {
        int[][] arr = new int[h][w];

        StringTokenizer st;
        for(int i=0; i<h; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        return arr;
    }

    private static int findIsland(int[][] arr) {
        int count = 0;

        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                if(arr[i][j] == 1) {
                    dfs(i, j, arr);
                    count++;
                }
            }
        }

        return count;
    }

    private static void dfs(int x, int y, int[][] arr) {
        arr[x][y] = 0;

        for(int i=0; i<8; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(0 <= nextX && nextX < h && 0 <= nextY && nextY < w) {
                if(arr[nextX][nextY] == 1) {
                    dfs(nextX, nextY, arr);
                }
            }
        }
    }
}
