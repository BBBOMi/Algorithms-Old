package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-02-19.
 */

public class Main_1520 {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static int[][] arr;
    public static boolean[][] check;

    public static int h = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int m = Integer.parseInt(s.split(" ")[0]);
        int n = Integer.parseInt(s.split(" ")[1]);

        arr = new int[m][n];
        check = new boolean[m][n];

        String[] strArr;
        for(int i=0; i<m; i++) {
            s = br.readLine();
            strArr = s.split(" ");
            for(int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        solution(0 , 0);
        System.out.println(h);
    }

    static void solution(int x, int y) {
        if(x == arr.length-1 && y == arr[0].length-1) {
            ++h;
            return;
        }

        for(int i=0; i<4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX<0 || nextY<0 || nextX>=arr.length || nextY>=arr[0].length) {
                continue;
            }

            if(check[nextX][nextY]) {
                continue;
            }

            if(arr[nextX][nextY] < arr[x][y]) {
                check[x][y] = true;
                solution(nextX, nextY);
            }
        }
        check[x][y] = false;
    }
}
