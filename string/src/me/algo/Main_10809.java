package me.algo;

import java.util.Scanner;

public class Main_10809 { // #10809

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String word = input.next();
		
		/*if(word.length() >= 100)
			return;
*/		
		char[] ch = word.toCharArray();
		
		/*for(int i=0; i<ch.length; i++)
			if(!(97 <= ch[i] && ch[i] <= 122))
				return;*/
		
		int[] point = new int[26];
		
		for(int i=0; i<point.length; i++)
			point[i] = -1;
		
		for(int i=0; i<ch.length; i++)
			if(point[(ch[i])-97] == -1)
				point[(ch[i])-97] = i;
		
		for(int i=0; i<point.length; i++)
			System.out.print(point[i] + " ");
	}
}
