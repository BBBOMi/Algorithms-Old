/*
 * <문제> n개의 정수로 이루어진 임의의 수열이 주어진다. 우리는 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 단, 수는 한 개 이상 선택해야 한다.
 * <입력> 첫째 줄에 정수 n(1 ≤ n ≤ 100,000)이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다. 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.
 * <출력> 첫째 줄에 답을 출력한다.
 */
package DP;

import java.util.*;

public class Main_1912 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine().trim());
		int[] arr = new int[n];
		
		for(int i=0 ; i<arr.length; i++) {
			arr[i] = Integer.parseInt(sc.next().trim());
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=i; j<arr.length; j++) {
				sum += arr[j];
				if(max < sum) {
					max = sum;
				} 
			}
		}

		System.out.println(max);
	}

}
