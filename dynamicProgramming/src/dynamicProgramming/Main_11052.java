package dynamicProgramming;

import java.util.*;

public class Main_11052 {
	static int n;
	static int[] arr;
	static int max = 0;
	static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine().trim());
		arr = new int[n+1];
	
		for(int i=1; i<arr.length; i++) {
			arr[i] = Integer.parseInt(sc.next().trim());
		}
		
		solution(0, 0);
	}

	static void solution(int num, int sum) {
		if(num > n) {
			return;
		}
		if(num == n) {
			if(max < sum) {
				max = sum;
			}
			return;
		}
		
	}
}
