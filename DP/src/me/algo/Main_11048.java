package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-04-24.
 */
public class Main_11048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[][] arr = new int[n+1][m+1];
        int[][] dp = new int[n+1][m+1];

        for(int i=1; i<=n; i++) {
            String[] str = br.readLine().split(" ");
            for(int j=1; j<=m; j++) {
                arr[i][j] = Integer.parseInt(str[j-1]);
                dp[i][j] = max(max(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1]) + arr[i][j];
            }
        }
        System.out.println(dp[n][m]);
    }

    static int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
}
