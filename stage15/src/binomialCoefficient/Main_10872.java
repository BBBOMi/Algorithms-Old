/* <문제> 0보다 크거나 같은 정수 N이 주어진다. 이 때, N!을 출력하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
 * <출력> 첫째 줄에 N!을 출력한다.
 */
package binomialCoefficient;

import java.util.Scanner;

public class Main_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
	
	static int factorial(int n) {
		if(n < 0 || 12 < n) return -1;
		if(n == 0) return 1;
		return n * factorial(n-1);
	}

}
