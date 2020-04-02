package me.algo;

import java.io.*;

/**
 * Created by bomi on 2019-11-11.
 * 문제 출처 : https://www.acmicpc.net/problem/1699
 *
 * 시간 복잡도 : O(N^2)
 * 사용한 알고리즘 : DP
 * 사용한 자료구조 : 배열
 */
public class Main_1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++) {
            for(int j=1; j*j<=i; j++) {
                if(dp[i] == 0 || dp[i] > dp[i - j*j]+1) {
                    dp[i] = dp[i - j*j] + 1;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(dp[n] + "\n");
        bw.close();
        br.close();

    }

}
