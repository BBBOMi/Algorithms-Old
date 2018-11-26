/*
 * <문제> 오늘부터 N+1일째 되는날 퇴사를 하기 위해서, 남은 N일 동안 최대한 많은 상담을 하려고 한다.
  		각각의 상담은 상담을 완료하는데 걸리는 기간 Ti와 상담을 했을 때 받을 수 있는 금액 Pi로 이루어져 있다.
  		상담을 적절히 했을 때, 백준이가 얻을 수 있는 최대 수익을 구하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 N (1 ≤ N ≤ 15)이 주어진다. 둘째 줄부터 N개의 줄에 Ti와 Pi가 공백으로 구분되어서 주어지며,
 		 1일부터 N일까지 순서대로 주어진다. (1 ≤ Ti ≤ 5, 1 ≤ Pi ≤ 1,000)
 * <출력> 첫째 줄에 백준이가 얻을 수 있는 최대 이익을 출력한다.
 */
package DP;

import java.util.*;

public class Main_14501 {
	static int[] t;
	static int[] p;
	static int max = 0; 
	static int sum = 0;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		t = new int[n];
		p = new int[n];

		for(int i=0; i<n; i++) {
			t[i] = Integer.parseInt(sc.next().trim());
			p[i] = Integer.parseInt(sc.next().trim());
		}
		solution(0, 0);
		System.out.println(max);
	}

	static void solution(int day, int sum) {
		if(day > n) {
			return;
		}
		if(day == n) {
			if(max < sum) {
				max = sum;
			}
			return;
		}
		
		solution(day + 1, sum);
		solution(day + t[day], sum + p[day]);
	}
}
