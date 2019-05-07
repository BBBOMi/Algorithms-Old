package me.algo;

import java.util.Scanner;

public class Main_2941 { // #2941

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String word = input.next();
		int count = 0;
		
		for(int i=0; i<word.length(); i++) {
			switch(word.charAt(i)) {
			case 'c':
				if((i != word.length()-1) && (word.charAt(i+1) == '=' || word.charAt(i+1) == '-'))
					i++;
				count++;
				break;
				
			case 'd':
				if((i != word.length()-1)) {
					if(word.charAt(i+1) == '-')
						i++;
					else if((word.charAt(i+1) == 'z') && (word.charAt(i+2) == '='))
						i += 2;
				}
					count++;
				break;
				
			case 'l': case 'n':
				if((i != word.length()-1) && (word.charAt(i+1) == 'j'))
					i++;
				count++;
				break;
				
			case 's': case 'z':
				if((i != word.length()-1) && word.charAt(i+1) == '=')
					i++;
				count++;
				break;
				
			default:
				count++;
			}
		}
		
		System.out.println(count);

	}

}
