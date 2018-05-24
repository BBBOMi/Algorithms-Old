

import java.util.Scanner;

public class Main_1152 { // #1152

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[1000000];
		Scanner input = new Scanner(System.in);
		String c = input.nextLine();
		int count = 1;
		
		for(int i=0; i<c.length(); i++ ) {
			arr[i] = c.charAt(i);
		}
		
		for(int i=0; i<c.length(); i++) {
			if(arr[i] == ' ')
				count++;
		}
		
		for(char ch : arr)
			System.out.print(ch);
		
		System.out.println(count);
		

	}

}
