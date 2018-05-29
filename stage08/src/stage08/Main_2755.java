package stage08;

import java.util.*;

public class Main_2755 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[t];
		
		for(int i=0; i<arr.length; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			arr[i] = howManyLive(k, n);
		}
		
		for(int i : arr)
			System.out.println(i);
	}
	
	public static int howManyLive(int k, int n) {
		if(k == 0) return n;
		if(n == 1) return 1;
		
		return howManyLive(k-1, n) + howManyLive(k, n-1);
	}

}
