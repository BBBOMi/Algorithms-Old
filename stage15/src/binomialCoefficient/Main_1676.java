/* <문제> N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)
 * <출력> 첫째 줄에 구한 0의 개수를 출력한다.
 */
package binomialCoefficient;

import java.util.*;

public class Main_1676 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countZero(n));
	}
	
	static int countZero(int n) {
		if(n < 0 || 500 < n) return -1;
		int count = 0;

		for(int i=0; i<=n; i++) {
			int num = i;
			while(num % 5 == 0 && 5 <= num) {
				count++;
				num /= 5;
			}
		}
		return count;
	}

}
