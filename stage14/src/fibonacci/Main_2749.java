/* <문제> n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 n이 주어진다. n은 1,000,000,000,000,000,000보다 작거나 같은 자연수이다.
 * <출력> 첫째 줄에 n번째 피보나치 수를 1,000,000으로 나눈 나머지를 출력한다.
 */
package fibonacci;

import java.util.*;

public class Main_2749 {
	static long n;
	static int[] fibonacci;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		if(n < 1 || 1000000000000000000L < n) return;
		
		int period = 15 * 100000;
		fibonacci = new int[period];
		fibonacci[1] = 1;

		int ind = (int)(n % period);
		for(int i=2; i<=ind; i++) {
			fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]) % 1000000;
		}
		
		System.out.println(fibonacci[ind]);
	}

}
