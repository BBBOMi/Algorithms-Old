package me.algo;

import java.util.Scanner;

public class Main_1316 { // #1316

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = n;
		
		for(int i=0; i<n; i++) {
			String word = input.next();
			boolean[] check = new boolean[26];
			
			for(int j=1; j<word.length(); j++) {
				if(word.charAt(j-1) != word.charAt(j)) {
					if(check[word.charAt(j) - 'a'] == true) {
						count--;
						break;
					}
					check[word.charAt(j-1) - 'a'] = true;
				}
				
			}
		}
		
		System.out.println(count);
	}
}
