package stage08;

import java.util.*;

public class Main_1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] count = new int[t];
	
		for(int i=0; i<t; i++) {
			int x = Integer.parseUnsignedInt(sc.next().trim());
			int y = Integer.parseUnsignedInt(sc.next().trim());
			int distance = Integer.parseUnsignedInt(y - x + "");
			
			count[i] = moveCount(distance);
		}
		
		for(int i=0; i<count.length; i++)
			System.out.println(count[i]);
		
	}
	
	static int moveCount(int dis) {
		int n = Integer.parseUnsignedInt(Math.ceil(Math.sqrt(dis)) + "");
		
		if(dis == n) {
			return 2 * n - 1;
		} else {
			int k = Integer.parseUnsignedInt(n - dis + "");
			if((n-1) >= k) {
				return 2 * (n-1) + 1;
			} else {
				return 2 * (n-1);
			}
		}
	}
}
