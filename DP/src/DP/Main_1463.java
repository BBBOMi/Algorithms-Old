package DP;

import java.util.*;

public class Main_1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int count = 0;
		
		while(n != 1) {
			if( (n-1) % 3 == 0) {
				
			}
			if(n % 3 == 0) {
				n /= 3;
			} else if(n % 2 == 0) {
				n /= 2;
			} else {
				n--;
			}
			count++;
			System.out.println(n + " " + count);
		}
		
		System.out.println(count);
		System.out.println(Integer.MAX_VALUE);
	}

}
