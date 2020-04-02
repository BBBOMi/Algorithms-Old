package me.algo;

import java.util.*;

public class Main_10164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] vars = line.split(" ");

		int n = Integer.parseInt(vars[0]);
		int m = Integer.parseInt(vars[1]);
		int k = Integer.parseInt(vars[2]);

		countRoute(n, m, k);
	}

	static void countRoute(int n, int m, int k) {
		if((1>n || 15<n) || (1>m || 15<m)) return;
		if(k<0 || n*m<k) return;

		if(k==0) k = n*m;
		int c = (k-1) / m + 1;
		int r = (k-1) % m + 1; // k좌표까지의 배열 사이즈

		System.out.println(solution(n, m, c, r));
	}

	static int solution(int n, int m, int c, int r) {
		int maxC = (c > n-c+1) ? c : n-c+1;
		int maxR = (r > m-r+1) ? r : m-r+1;

		int[][] arr = new int[maxC][maxR];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i ==0 || j==0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i-1][j] + arr[i][j-1];
				}
			}
		}
		return arr[c-1][r-1] * arr[n-c][m-r];
	}
}
