package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_2579 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] score = new int[n + 1];
		int[] dp = new int[n + 1];

		for(int i=1 ; i<n+1; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}

		dp[1] = score[1];
		dp[2] = max(score[1]+score[2], score[2]);
		dp[3] = max(score[1]+score[3], score[2]+score[3]);

		for(int i=4; i<=n; i++) {
			dp[i] = max(dp[i-2]+score[i], score[i-1]+score[i]+dp[i-3]);
		}

		System.out.println(dp[n]);

	}

	static int max(int n1, int n2) {
		return n1 >= n2 ?  n1: n2;
	}
}
