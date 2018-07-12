package divideAndConquer;

import java.util.*;

public class Main_1074 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();
		String[] numbers = line.split(" ");
		
		int n = Integer.parseInt(numbers[0]);
		int r = Integer.parseInt(numbers[1]);
		int c = Integer.parseInt(numbers[2]);
		
		int size = (int)Math.pow(2, n);
		if((n<1 || 15<n) || (0>r || 0>c || size-1<r || size-1<c)) return;
		
		int result = visited(n, r, c);
		System.out.println(result);
	}
	
	public static int log(int n ,int base) {
		return (int)(Math.log(n) / Math.log(base));
	}
	
	public static int visited(int n, int r, int c) {
		int value = 0;
		while(true) {
			int r1 = (int)Math.pow(2, log(r, 2));
			int c1 = (int)Math.pow(2, log(c, 2));		
			r1 = (r1 < c1) ? 0 : r1;
			c1 = (c1 < r1) ? 0 : c1;
			int R1 = (r1 == 0) ? 0 : (int)Math.pow(2, log(r1, 2) * 2 + 1);
			int C1 = (c1 == 0) ? 0 : (int)Math.pow(2, log(c1, 2) * 2);
			value += R1 + C1;
			if(r1 == r && c1 == c) return value;
			r -= r1;
			c -= c1;
		}
	}
}		


