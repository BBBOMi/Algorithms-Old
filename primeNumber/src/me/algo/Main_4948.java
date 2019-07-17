package me.algo;

import java.util.*;

public class Main_4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> testCode = new ArrayList<>();
		ArrayList<Boolean> prime = new ArrayList<>();
		int n = 0;
		int max = 0;
		
		while(true) {
			n = sc.nextInt();
			
			if(n != 0) {
				testCode.add(n);
				if(max < n) max = n;
			} else break;
		}
		
		prime.add(0, false);
		prime.add(1, false);
		for(int i=2; i<=(max*2); i++) {
			prime.add(i, true);
		}
		
		for(int i=2; (i*i)<=(max*2); i++) {
			if(prime.get(i)) {
				for(int j=(i*i); j<=(max*2); j+=i) {
					prime.set(j, false);
				}
			}
		}
		
		for(int i=0; i<testCode.size(); i++) {
			int count = 0;
			int ind = testCode.get(i);
			for(int j=ind; j<=(ind*2); j++) {
				if(prime.get(j)) count++;
			}
			if(prime.get(ind)) count--;
			testCode.set(i, count);
		}
		
		for(int i=0; i<testCode.size(); i++)
			System.out.println(testCode.get(i));
	}

}
