package primeNumber;

import java.util.*;

public class Main_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean flag;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			flag = true;
			for(int j=2; j<arr[i]; j++) {
				if(arr[i]%j == 0) {
					flag = false;
					break;
				}
			}
			
			if(arr[i] == 0 || arr[i] == 1)
				flag = false;

			if(flag == true) count++;
		}

		System.out.println(count);
		
	}
}
