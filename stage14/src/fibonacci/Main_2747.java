/* <문제> 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.
 	그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다. 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.
	n=17일때 까지 피보나치 수를 써보면 다음과 같다.
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
	n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 n이 주어진다. n은 45보다 작거나 같은 자연수이다.
 * <출력> 첫째 줄에 n번째 피보나치 수를 출력한다.
 */
package fibonacci;

import java.util.*;

public class Main_2747 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(45 < n) return;
		
		int result = fibonacci(n);
		System.out.println(result);
	}
	
	public static int fibonacci(int n) {
		int[] fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2; i<=n; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		return fib[n];
	}

}
