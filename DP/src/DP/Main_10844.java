package DP;

import java.io.*;

public class Main_10844 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n+1];
		
		dp[1] = 9;
		for(int i=2; i<dp.length; i++) {
			dp[i] = dp[i-1] * 2 - (i-1) % 1000000000;
		}
		
		bw.write(dp[n]);
		bw.close();
		br.close();

	}

}
