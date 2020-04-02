/*
 * <문제> n개의 방이 일렬로 늘어선 감옥이 있다. 첫 번째 라운드에서 감옥을 한 개씩 모두 연다. 
 		k번째 라운드에서는 번호가 k의 배수인 방이 열려 있으면 잠그고, 잠겨 있다면 연다.
 		n번째 라운드까지 진행한 이후, 열려 있는 방의 학생은 도주.
 		도주한 학생의 수를 구하라.
 * <입력> 입력의 첫 번째 줄에는 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄에 한 개씩 방의 개수 n(5 ≤ n ≤ 100)이 주어진다.
 * <출력> 한 줄에 한 개씩 각 테스트 케이스의 답, 즉 몇 명이 탈출할 수 있는지를 출력한다.
 */

package me.algo;

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
			for(int j=i; j<=size; j++) {
				if(j % i == 0)
					rooms[j-1] = !rooms[j-1];
			}
			/*for(int j=1, sub=i*j; sub<=size; sub=i*(++j))
				rooms[sub-1] = !rooms[sub-1];
				*/
		}
		int count=0;
		for(int i=0; i<rooms.length; i++) {
			if(!rooms[i]) count++;
		}
		System.out.println(count);
	}

}
