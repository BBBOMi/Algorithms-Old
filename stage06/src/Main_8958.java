

import java.util.Scanner;

public class Main_8958 { // #8958

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int testCase = Integer.parseInt(input.nextLine());
		String[] arr = new String[testCase];
		int score[] = new int[testCase];
		
		for(int i=0; i<testCase; i++) {
			arr[i] = input.nextLine(); 
			if(!(0 < arr[i].length() && arr[i].length() < 80))
				return;
		}
		
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			for(int j=0; j<arr[i].length(); j++) {
				char ch = arr[i].charAt(j);
				if(ch == 'O') {
					count++;
					score[i] += count;
				} else if(ch == 'X')
					count = 0;
			}
		}
		
		for(int i : score)
			System.out.println(i);
		
		

	}

}
