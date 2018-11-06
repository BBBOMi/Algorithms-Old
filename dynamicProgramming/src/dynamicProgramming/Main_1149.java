package dynamicProgramming;

import java.util.*;

public class Main_1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine().trim());

		int[][] arr = new int[n][3];
		int[][] dp = new int[n][3];

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<=3; j++) {
				arr[i][j] = Integer.parseInt(sc.next().trim());
			}
		}

		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];

		for(int i=1; i<n; i++) {
			dp[i][0] = arr[i][0] + min(dp[i-1][1], dp[i-1][2]);
			dp[i][1] = arr[i][1] + min(dp[i-1][0], dp[i-1][2]);
			dp[i][2] = arr[i][2] + min(dp[i-1][0], dp[i-1][1]);
		}

		System.out.println(min(min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
	}
	
	static int min(int a, int b) {
		return a>b ? b : a;
	}
}