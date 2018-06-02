package stage08;

import java.util.*;

public class Main_6064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] k = new int[t];
		
		for(int i=0; i<k.length; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			//k[i] = cainCalendar(m, n, x, y);
		}
		
		for(int i : k)
			System.out.println(i);
	}
	
	/*public static int cainCalendar(int m, int n, int x, int y) {
	int end = m * n / 2;
	int sub = Math.abs(m - n);
		
	for(int i=1; i<=m; i++) {
		for(int j=1; j<=n; j++) {
				
			}
		}
		
	}*/
}
