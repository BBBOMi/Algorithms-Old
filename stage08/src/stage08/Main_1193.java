/* <문제>
 * 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 순서로 
 * 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 X(1≤X≤10,000,000)가 주어진다.
 * <출력> 첫째 줄에 분수를 출력한다.
 */

package stage08;

import java.util.*;

public class Main_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		int x = sc.nextInt();
		int n = 1;
		
		while(true) {
			if((n * (n + 1) * 0.5) >= x) break;
			else n++;
		}
		
		int order = (int)(n * (n + 1) * 0.5) - x;
		if(n%2 == 0) {
			System.out.println((n-order) + "/" + (order+1));
		} else
			System.out.println((order+1) +"/" + (n-order));
	}
}
