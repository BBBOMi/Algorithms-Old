/* <문제> 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 M(≤ N)이 주어진다. 이제 순서대로 M번째 사람을 제거한다.
  	한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, M)-조세퍼스 순열이라고 한다.
  	예를 들어 (7, 3)-조세퍼스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
  	N과 M이 주어지면 (N,M)-조세퍼스 순열을 구하는 프로그램을 작성하시오.  	
  
 * <입력> 첫째 줄에 N과 M이 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ M ≤ N ≤ 1,000)
 * <출력> 예제와 같이 조세퍼스 순열을 출력한다.
 */
package queue;

import java.util.*;

public class Main_11866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();
		String[] value = line.split(" ");
		int n = Integer.parseInt(value[0]);
		int m = Integer.parseInt(value[1]);
		
		if(!(1 <= m && m <= n && n <= 1000)) return;
		
		LinkedList<Integer> CL = new LinkedList<>();
		for(int i=0; i<n; i++) {
			CL.add(i, i+1);
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append('<');
		int count = 0;
		while(true) {
			if(CL.isEmpty())
				break;
			count = (count + m -1) % CL.size();
			int num = CL.remove(count);
			sb.append(num + (CL.size() != 0? ", " : ""));
		}
		sb.append('>');
		
		System.out.println(sb.toString());
	}

}
