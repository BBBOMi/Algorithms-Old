/* <문제> 1은 2번 출력되고, 0은 1번 출력된다. 
	N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.
 * <출력> 각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.
 */
package fibonacci;

import java.util.*;

public class Main_1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine().trim());
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(sc.nextLine().trim());
			fibonacci(n);
		}
	}

	static void fibonacci(int n) {
		if(n < 0 || 40 < n) return;
		Map<Integer, Integer> countZero = new TreeMap<>();
		Map<Integer, Integer> countOne = new TreeMap<>();
		countZero.put(0, 1); countZero.put(1, 0);
		countOne.put(0, 0); countOne.put(1, 1);
		
		for(int i=2; i<=n; i++) {
			int ind1 = countZero.get(i-1);
			int ind2 = countZero.get(i-2);
			countZero.put(i, ind1+ind2);
			
			ind1 = countOne.get(i-1);
			ind2 = countOne.get(i-2);
			countOne.put(i, ind1+ind2);
		}
		
		System.out.println(countZero.get(n) + " " + countOne.get(n));
	}
}
