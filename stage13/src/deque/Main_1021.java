/* <문제> N개의 원소를 포함하고 있는 양방향 순환 큐를 가지고 있다. 이 큐에서 몇 개의 원소를 뽑아내려고 한다.
  	이 큐에서 다음과 같은 3가지 연산을 수행할 수 있다.
	1.첫번째 원소를 뽑아낸다. 이 연산을 수행하면, 원래 큐의 원소가 a1, ..., ak이었던 것이 a2, ..., ak와 같이 된다.
	2.왼쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 a2, ..., ak, a1이 된다.
	3.오른쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 ak, a1, ..., ak-1이 된다.
	큐에 처음에 포함되어 있던 수 N이 주어진다. 그리고 뽑아내려고 하는 원소의 위치가 주어진다. (이 위치는 가장 처음 큐에서의 위치이다.)
	이 때, 그 원소를 주어진 순서대로 뽑아내는데 드는 2번, 3번 연산의 최솟값을 출력하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 큐의 크기 N과 뽑아내려고 하는 수의 개수 M이 주어진다.  N은 50보다 작거나 같은 자연수이고, M은 N보다 작거나 같은 자연수이다.
  	둘째 줄에는 뽑아내려고 하는 수의 위치가 순서대로 주어진다. 위치는 1보다 크거나 같고, N보다 작거나 같은 자연수이다.
 * <출력> 첫째 줄에 문제의 정답을 출력한다.
 */
package deque;

import java.util.*;

public class Main_1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();
		String[] numbers = line.split(" ");
		int n = Integer.parseInt(numbers[0]);
		int m = Integer.parseInt(numbers[1]);
		if(!(1 <= m && m <= n && n <= 50)) return;

		line = sc.nextLine().trim();
		numbers = line.split(" ");
		if(numbers.length != m) return;

		int[] index = new int[numbers.length];
		Deque<Integer> dq = new LinkedList<>();

		for(int i=0; i<numbers.length; i++)
			index[i] = Integer.parseInt(numbers[i]);

		for(int i=1; i<=n; i++)
			dq.addLast(i);

		int count = 0;
		for(int i=0; i<index.length; i++) {
			if(index[i] < 1 || n < index[i]) return;
			int half = (dq.size() + 1) / 2;
			int pos = 1;
			
			Iterator<Integer> it = dq.iterator();
			while(it.hasNext()) {
				if((int)it.next() == index[i])
					break;
				pos++;
			}
			
			if(pos <= half) {
				while(dq.peekFirst() != index[i]) {
					int value = dq.removeFirst();
					dq.addLast(value);
					count++;
				}
			} else {
				while(dq.peekFirst() != index[i]) {
					int value = dq.removeLast();
					dq.addFirst(value);
					count++;
				}
			}
			
			if(index[i] == dq.peekFirst()) {
				dq.removeFirst();
			}
		}

		System.out.println(count);
	}

}
