/* <문제> 수 N개 A1, A2, ..., AN이 주어진다. A를 오름차순 정렬했을 때, 앞에서부터 K번째 있는 수를 구하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 N(1 ≤ N ≤ 5,000,000)과 K (1 ≤ K ≤ N)이 주어진다. 둘째에는 A1, A2, ..., AN이 주어진다. (-109 ≤ Ai ≤ 109)
 * <출력> A를 정렬했을 때, 앞에서부터 K번째 있는 수를 출력한다.
 */
package divideAndConquer;

import java.util.*;

public class Main_11004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();
		
		int n = Integer.parseInt(line.split(" ")[0]);
		int k = Integer.parseInt(line.split(" ")[1]);
		if(!(1<=k && k<=n && n<=5000000)) return;
		
		int[] intArr = new int[n];
		for(int i=0; i<intArr.length; i++)
			intArr[i] = sc.nextInt();
		
		Arrays.sort(intArr);
		
		System.out.println(intArr[k-1]);

	}

}
