package divideAndConquer;

import java.util.*;

public class Main_1074 {
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();
		String[] numbers = line.split(" ");
		
		int n = Integer.parseInt(numbers[0]);
		int r = Integer.parseInt(numbers[1]);
		int c = Integer.parseInt(numbers[2]);
		
		int size = (int)Math.pow(2, n);
		if((n<1 || 15<n) || (0>r || 0>c || size-1<r || size-1<c)) return;
		
		visited(size, r, c);
		System.out.println(count);
	}
	
	public static void visited(int size, int r, int c) {
		if(r == 0 && c == 0) return;	
		size /= 2;
		r /= 2;
		c /= 2;
		count += 4;
		visited(size, r, c);
		}
}
