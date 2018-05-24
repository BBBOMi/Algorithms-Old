

import java.util.Scanner;

public class Main_2577 { // #2577

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a = Integer.parseInt(input.nextLine());
		int b = Integer.parseInt(input.nextLine());
		int c = Integer.parseInt(input.nextLine());
		
		if(!((100 <= a) && (a < 1000) || (100 <= b) && (b < 1000) || (100 <= c) && (c < 1000)))
			return;
		
		String result = (a * b * c) + "";
		int[] count = new int[10];
		
		for(int i=0; i<result.length(); i++) {
			char ch = result.charAt(i);
			count[ch - '0']++;
		}
		
		for(int i : count)
			System.out.println(i);
		

	}

}
