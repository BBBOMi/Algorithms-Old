package DP;

import java.io.*;

public class Main_10844 {
	private static final int MOD = 1000000000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] dp = new int[n+1][11];

		for(int i=1; i<=9; i++) {
			dp[1][i] = 1;
		}

		for(int i=2; i<=n; i++) {
			dp[i][0] = dp[i-1][1];
			for(int j=1; j<=9; j++) {
				dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD;
			}
		}

		long res = 0;
		for(int i : dp[n]) {
			res += i;
		}

		bw.write((res % MOD) + "\n");
		bw.close();
		br.close();
	}
}
