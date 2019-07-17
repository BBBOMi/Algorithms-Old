package me.algo;

import java.util.*;

public class Main_9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int max = 0;
		Map<Integer, Integer> num = new LinkedHashMap<>();
		ArrayList<Boolean> prime = new ArrayList<>();
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			num.put(n, 0);
			if(max < n) max = n;
		}
		
		prime.add(0, false);
		prime.add(1, false);
		for(int i=2; i<=max; i++) {
			prime.add(i, true);
		}
		
		for(int i=2; (i*i)<=max; i++) {
			if(prime.get(i)) {
				for(int j=i*i; j<=max; j+=i) {
					prime.set(j, false);
				}
			}
		}
		
		ArrayList<Integer> keySet = new ArrayList<>(num.keySet());
		for(int i=0; i<keySet.size(); i++) {
			Integer k = keySet.get(i);
			int half = k/2;
			
			if(!prime.get(half)) {
				while(true) {
					half--;
					if(prime.get(half) && prime.get(k-half))
						break;
				}
			}	
			num.put(k, half);
		}
		
		for(int i=0; i<num.size(); i++) {
			int k = keySet.get(i);
			int v = num.get(k);
			System.out.println(v < (k-v)? v + " " + (k-v) : (k-v) + " " + v);
		}
	}

}
