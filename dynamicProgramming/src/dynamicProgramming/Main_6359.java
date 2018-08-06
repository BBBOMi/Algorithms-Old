package dynamicProgramming;

import java.util.*;

public class Main_6359 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			countRunners(n);
		}
	}
	
	static void countRunners(int n) {
		if(n < 5 || 100 < n) return;
		int size = n;
		boolean[] rooms = new boolean[size];
		// 열려있는 상태 - false
		for(int i=2; i<=n; i++) {
			int block = size % i;
			//if()
		}
	}

}
