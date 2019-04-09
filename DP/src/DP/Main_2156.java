package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-04-09.
 */
public class Main_2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+1][2];
        boolean[][] check = new boolean[n+1][2];

        for(int i=1; i<n; i++) {
            int w = Integer.parseInt(br.readLine());
            for(int j=0; j<dp[0].length; j++) {
                dp[i][j] = Math.max(dp[i - 1][0], dp[i - 1][1]);
//                if(i > 2) {
//                    if(check)
//                }
//                if() {
//                     dp[i][j] += w;
//                } else {
//
//                }
            }
        }


    }
}
