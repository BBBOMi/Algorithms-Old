

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_1152 { // #1152

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int count = 0;
		
		if(str.length() > 1000000) return;
		
		StringTokenizer strToken = new StringTokenizer(str, " ");
		
		while(strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			count++;
		}
		
		System.out.println(count);
		
	}

}
