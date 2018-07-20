/* <문제> 자연수 N과 정수 K가 주어졌을 때 이항 계수 (NK)를 10,007로 나눈 나머지를 구하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ K ≤ N)
 * <출력> (NK)를 10,007로 나눈 나머지를 출력한다.
 */
package binomialCoefficient;

import java.util.*;

public class Main_11051 {
	static int[][] fact = new int[1001][1001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next().trim());
		int k = Integer.parseInt(sc.next().trim());
		System.out.println(solution(n, k));
	}
	
	static int solution(int n, int k) {
		if(!((1<=n && n<=1000) || (0<=k && k<=n))) return -1;
		if(n==k || k==0) return 1;
		if(fact[n][k] == 0)
			fact[n][k] = solution(n-1, k-1) + solution(n-1, k);
		return fact[n][k] % 10007;
	}
}
