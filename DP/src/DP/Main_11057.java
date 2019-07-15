package DP;

import java.io.*;

/**
 * Created by bomi on 2019-07-15.
 */
public class Main_11057 {
    private static final int MOD = 10007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n+1][11];
        for(int i=0; i<10; i++) {
            dp[1][i] = 1;
        }
        dp[1][10] = 10;

        for(int i=2; i<=n; i++) {
            dp[i][0] = 1;
            int sum = 1;
            for(int j=1; j<10; j++) {
                dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % MOD;
                sum = (sum + dp[i][j]) % MOD;
            }
            dp[i][10] = sum;
        }

        System.out.println(dp[n][10]);
        br.close();
    }
}
