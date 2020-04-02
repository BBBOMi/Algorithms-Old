package me.algo;

import java.util.Scanner;

/**
 * Created by bomi on 2019-10-18.
 * 문제 출처 : https://www.acmicpc.net/problem/11726
 *
 * 시간 복잡도 : O(N)
 * 공간 복잡도 : O(N)
 * 사용한 알고리즘 : DP
 * 사용한 자료구조 : 배열
 */
public class Main_11726 {
    private static final int MOD = 10007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n+1];
        dp[1] = 1;
        if(n >= 2) dp[2] = 2;

        for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % MOD;
        }

        System.out.println(dp[n]);
    }
}
