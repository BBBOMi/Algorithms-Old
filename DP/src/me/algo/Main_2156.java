package me.algo;

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

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        for(int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(n == 1) {
            System.out.println(arr[1]);
            return;
        }

        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];

        for(int i=3; i<=n; i++) {
            dp[i] = max(dp[i-3]+arr[i-1]+arr[i], dp[i-2]+arr[i], dp[i-1]);
        }

        System.out.println(dp[n]);
    }

    static int max(int a, int b, int c) {
        if(a >= b) return c > a ? c : a;
        return c > b ? c : b;
    }
}
