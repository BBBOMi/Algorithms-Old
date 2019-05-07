package me.algo;

import java.util.Scanner;

public class Main_2675 { // #2675

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		
		String[][] arr = new String[t][2];
		//String[] str = new String[t];

		for(int i=0; i<t; i++) {
			arr[i][0] = input.next();
			arr[i][1] = input.next();
			input.nextLine();
		}

		for(int i=0; i<arr.length; i++) {
			int r = Integer.parseInt(arr[i][0]);
			for(int j=0; j<arr[i][1].length(); j++) {
				for(int k=0; k<r; k++) {
					//str[i] += arr[i][1].charAt(j);
					char ch = arr[i][1].charAt(j);
					System.out.print(ch);
				}
			}
			System.out.println();
		}
		
		/*for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
*/
	}
}
