package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-04-23.
 */
public class Main_11722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        int max = 0;
        for(int i=n; i>0; i--) {
            arr[i] = Integer.parseInt(str[i-1]);
            for(int j=n; j>i; j--) {
                if(arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if(dp[i] == 0) dp[i] = 1;
            if(max < dp[i]) max = dp[i];
        }
        System.out.println(max);
    }
}
