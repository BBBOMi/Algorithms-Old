package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-04-25.
 */
public class Main_1965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        int max = 0;
        for(int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(str[i-1]);
            for(int j=1; j<i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            if(dp[i] == 0) dp[i] = 1;
            if(max < dp[i]) max = dp[i];
        }
        System.out.println(max);
    }
}
