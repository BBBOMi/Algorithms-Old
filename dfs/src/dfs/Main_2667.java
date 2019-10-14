package dfs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bomi on 2019-10-08.
 */
public class Main_2667 {
    private static int n;
    private static int[][] danzi;

    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy  = {1, -1, 0, 0};

    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        danzi = new int[n][n];
        for(int i=0; i<n; i++) {
            makeDanzi(br.readLine(), i);
        }

        List<Integer> danzisCount = new ArrayList<>();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(danzi[i][j] == 1) {
                    count = 0;
                    findDanzi(i, j);
                    danzisCount.add(count);
                }
            }
        }

        danzisCount.sort((n1, n2) -> (n1 - n2));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(danzisCount.size() + "\n");

        for(int i : danzisCount) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void makeDanzi(String line, int i) {
        for(int j=0; j<n; j++) {
            danzi[i][j] = line.charAt(j) - '0';
        }
    }

    private static void findDanzi(int x, int y) {
        danzi[x][y] = 0;
        count++;

        for(int i=0, nextX, nextY; i<4; i++) {
            nextX = x + dx[i];
            nextY = y + dy[i];

            if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
                if(danzi[nextX][nextY] == 1) {
                    findDanzi(nextX, nextY);
                }
            }
        }
    }


}
