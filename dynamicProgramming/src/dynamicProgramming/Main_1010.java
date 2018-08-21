package dynamicProgramming;

import java.util.*;

public class Main_1010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] array = new int[31][31];
			System.out.println(solution(n, m, array));
		}

	}
	
	static int solution(int n, int m, int[][] array) {
		if(!(0 < n && n <= m && m < 30)) return -1;
		if(n == m || m == 0) return 1;
		if(array[n][m] == 0)
			array[n][m] = solution(n-1, m-1, array) + solution(n-1, m, array);
		return (int)array[n][m];
		
	}

}
