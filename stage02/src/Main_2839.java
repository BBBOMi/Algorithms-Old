/* <문제> 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 		 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 필요한 봉지의 최소의 개수를 구하는 프로그램을 작성.
 * <입력> 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
 * <출력> 상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
 */

import java.util.Scanner;

public class Main_2839 { // #2839

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int count = 0;
		
		while(true) {
			if(n%5 == 0) {
				count += n/5;
				break;
			} else {
				if(n < 3 || 5000 < n) {
					count = -1;
					break;
				}
			}
			n -= 3;
			count++;
		}

		System.out.println(count);	
	}
}
