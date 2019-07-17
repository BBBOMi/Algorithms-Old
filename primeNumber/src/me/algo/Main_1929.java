package me.algo;

import java.util.*;

public class Main_1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Boolean> prime = new ArrayList<>();
		
		prime.add(0, false);
		prime.add(1, false);
		
		for(int i=2; i<=n; i++) {
			prime.add(i, true);
		}

		for(int i=2; (i*i)<=n; i++) {
			if(prime.get(i)) {
				for(int j=i*i; j<=n; j+=i) {
					prime.set(j, false);
				}
			}
		}
		
		while(m <= n) {
			if(prime.get(m))
				System.out.println(m);
			m++;
		}
	}
}
