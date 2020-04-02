package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-04-30.
 */
public class Main_1890 {
    static int[][] arr;
    static int[][] dp;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];
        dp = new int[n + 1][n + 1];

        for(int i = 1; i <= n; i++) {
            String[] s = br.readLine().split(" ");
            for(int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(s[j - 1]);
            }
        }

        dp[1][1] = 1;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(dp[i][j] == 0 || i==n && j==n) continue;

                int x = i + arr[i][j];
                int y = j + arr[i][j];

                if(x <= n) dp[x][j] += dp[i][j];
                if(y <= n) dp[i][y] += dp[i][j];
            }
        }
        System.out.println(dp[n][n]);
    }
}