package DP;

import java.util.*;

public class Main_11052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine().trim());
		int[] dp = new int[n+1];

		for(int i=1; i<dp.length; i++) {
			dp[i] = Integer.parseInt(sc.next().trim());
		}

		for(int i=1; i<dp.length; i++) {
			for(int j=1; j<=i/2; j++) {
				int num = dp[j] + dp[i-j];
				if(dp[i] < num) dp[i] = num;
			}
		}
		System.out.println(dp[n]);
	}
}
