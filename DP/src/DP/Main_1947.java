package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-05-03.
 */

public class Main_1947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1) {
            System.out.println(0);
            return;
        }

        int[] dp = new int[n+1];
        dp[2] = 1;
        for(int i=3; i<=n; i++) {
            long num =(long)(dp[i-2] + dp[i-1]) * (i-1) % 1000000000;
            dp[i] = (int)num;
        }

        System.out.println(dp[n]);
    }

}
