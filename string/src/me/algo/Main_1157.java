package me.algo;

import java.util.Scanner;

public class Main_1157 { // #1157
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		str = str.toUpperCase();
		int[] count = new int[26];
		int max = 0; char ch ='?';
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)-65]++;
			
			if(max < count[str.charAt(i)-65]) {
				max = count[str.charAt(i)-65];
				ch = str.charAt(i);
			} else if(max == count[str.charAt(i)-65]) {
				ch = '?';
			}
		}
		
		System.out.println(ch);

	}

}
