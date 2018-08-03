package dynamicProgramming;

import java.util.*;

public class Main_2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] score = new int[n];
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		int sum = score[score.length-1];
		int count = 0; // 스템 수
		for(int i=score.length-2; i>0; ) {
			if(score[i] >= score[i-1] && count < 3) {
				sum += score[i];
				i--;
				count++;
			} else {
				sum += score[i-1];
				i -= 2;
				count = 0;
			}
			
			if(count < 3)
		}
		
		System.out.println(sum);
	}

}
