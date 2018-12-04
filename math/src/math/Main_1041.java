package math;

import java.util.*;

public class Main_1041 {
	private static long sum = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[6];
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<6; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}

		if(n == 1) {
				sum -= max;
		} else {
			int min1 = Math.min(arr[0], arr[5]);
			int min2 = Math.min(arr[1], arr[4]);
			int min3 = Math.min(arr[2], arr[3]);

			sum = min * ((long)4*(n-1)*(n-2) + (long)(n-2)*(n-2));
			sum += Math.min(Math.min(min1 + min2, min1 + min3), min2 + min3) * (4*((n-1) + (n-2)));
			sum += 4 * (min1 + min2 + min3);
		}
		sc.close();
		System.out.println(sum);
	}
}
