package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-04-22.
 */
public class Main_11055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int[] a = new int[n+1];
        int[] dp = new int[n+1];
        int max = 0;
        for(int i=1; i<a.length; i++) {
            a[i] = Integer.parseInt(arr[i-1]);
            for(int j=1; j<i; j++) {
                if(a[j] < a[i]) {
                    dp[i] = Math.max(dp[j] + a[i], dp[i]);
                }
            }
            if(dp[i] == 0) dp[i] = a[i];
            if(max < dp[i]) max = dp[i];
        }
        
        System.out.println(max);
    }
}
