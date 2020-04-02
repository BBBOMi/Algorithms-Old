package me.algo;

import java.util.*;

public class Main_6616 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = -1;
		
		while(true) {
			n = Integer.parseInt(sc.nextLine().trim());
			
			if(n==0) {
				break;
			}
			
			String str = sc.nextLine().trim();
			String a = str.replace(" ", "").toUpperCase();
			char[] ch = new char[a.length()];
			
			int index = 0;
			int startIdx = 0;
			
			for(int i=0; i<ch.length; i++) {
				char c = a.charAt(i);
				ch[index] = c;
				index +=  n;
				
				if(index >= str.length()) {
					startIdx++;
					index = (startIdx % ch.length);
				}
				
			}
			
			for(int i=0; i<ch.length; i++) {
				System.out.print(ch[i]);
			}
			
		}
	}

}
