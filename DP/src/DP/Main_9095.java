package DP;

import java.io.*;

/**
 * Created by bomi on 2019-07-01.
 */
public class Main_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[] dp = new int[11];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        int j = 4;
        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            for( ; j<=n; j++) {
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }
           bw.write(dp[n] + "\n");
        }
        bw.close();
    }
}
