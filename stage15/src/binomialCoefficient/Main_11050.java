/* <문제> 자연수 N과 정수 K가 주어졌을 때 이항 계수 (NK)를 구하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 0 ≤ K ≤ N)
 * <출력> (NK)를 출력한다.
 */
package binomialCoefficient;

import java.util.*;

public class Main_11050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next().trim());
		int k = Integer.parseInt(sc.next().trim());
		
		solution(n, k);
	}
	
	public static void solution(int n, int k) {
		if(!((1 <= n && n <= 10) && (0 <= k && k <= n)))
			return;
		
		int numerator = factorial(n);
		int denominator = factorial(k) * factorial(n-k);
		
		System.out.println(numerator / denominator);
	}
	
	public static int factorial(int n) {
		if(n < 0) return -1;
		if(n == 0) return 1;
		return n * factorial(n-1);
	}
}
