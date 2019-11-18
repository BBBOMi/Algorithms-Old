package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-11-18.
 * 문제 출처 : https://www.acmicpc.net/problem/1904
 *
 * 시간 복잡도 : O(N)
 * 사용한 알고리즘 : DP(Memoization)
 * 사용한 자료구조 : 배열
 */
public class Main_1904 {
    private static final int MOD = 15746;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];

        if(n >= 1) {
            dp[1] = 1;
        }
        if(n >= 2) {
            dp[2] = 2;
        }

        for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % MOD;
        }

        System.out.println(dp[n]);
    }
}
