package math;

import java.util.*;

public class Main_1041 {
	private static long sum1 = 0;
	private static long sum2 = 0;
	private static long sum3 = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[6];
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0;i<6;i++) {
			arr[i] = sc.nextInt();
			sum1 += arr[i];
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		

		if(n == 1) {
				sum1 -= max;
		} else {
			sum1 = min * (5*n*n - 16*n + 12);
			
			int min1 = Math.min(arr[0], arr[5]);
			int min2 = Math.min(arr[1], arr[4]);
			int min3 = Math.min(arr[2], arr[3]);
			
			sum2 = Math.min(Math.min(min1 + min2, min1 + min3), min2 + min3) * (8*n - 12);
			sum3 = 4 * (min1 + min2 + min3);
		}
		sc.close();
		System.out.println(sum1+sum2+sum3);
	}


}
