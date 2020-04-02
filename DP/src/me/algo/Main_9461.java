package me.algo;

import java.io.*;

/**
 * Created by bomi on 2019-07-15.
 */
public class Main_9461 {
    private static long[] dp = new long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        dp[0] = 0;
        dp[1] = dp[2] = dp[3] = 1;
        dp[4] = 2;

        for(int i=5; i<=100; i++) {
            dp[i] = dp[i-1] + dp[i-5];
        }

        int t = Integer.parseInt(br.readLine());
        for(int i=0, n; i<t; i++) {
            n = Integer.parseInt(br.readLine());
            bw.write(dp[n] + "\n");
        }

        bw.close();
        br.close();
    }
}
