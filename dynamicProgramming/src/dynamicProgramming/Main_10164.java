package dynamicProgramming;

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
		
		int[][] arr = new int[n][m];
		int x = (k-1)/m;
		int y = (k-1)%m;
	
	}
}
