package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2018-11-26.
 */

public class Main_2240 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int t = Integer.parseInt(str[0]);
        int w = Integer.parseInt(str[1]);

        int[] arr = new int[t];
        int[][] dp = new int[t+1][w+1];

        for(int i=0; i<t; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(arr[0] == 1) {
            dp[1][0] = 1;
        } else {
            dp[1][1] = 1;
        }

        for(int i=2; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                if(j == 0) {
                    dp[i][0] = (arr[i-1] == 1) ? dp[i-1][0] + 1 : dp[i-1][0];
                } else {
                    if(j%2 == 0) {
                        dp[i][j] = (arr[i-1] == 1) ? Math.max(dp[i-1][j-1], dp[i-1][j]) + 1 : dp[i-1][j];
                    } else {
                        dp[i][j] = (arr[i-1] == 2) ? Math.max(dp[i-1][j-1], dp[i-1][j]) + 1 : dp[i-1][j];
                    }
                }
            }
         }

         int count = 0;
        for(int i=0; i<=w; i++) {
            count = count > dp[t][i] ? count : dp[t][i];
        }

        System.out.println(count);
    }
}
