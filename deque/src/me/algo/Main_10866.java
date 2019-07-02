/* <문제> 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
	명령은 총 여덟 가지이다.
	push_front X: 정수 X를 덱의 앞에 넣는다.
	push_back X: 정수 X를 덱의 뒤에 넣는다.
	pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	size: 덱에 들어있는 정수의 개수를 출력한다.
	empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
	front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * <입력> 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘쨰 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
 	주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 * <출력> 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 */
package me.algo;

import java.util.*;

public class Main_10866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine().trim());
		if(!(1 <= n && n <= 10000)) return;
		
		MyDeque DQ = new MyDeque();
		
		for(int i=0; i<n; i++) {
			String order = sc.nextLine().trim();
			switch(order) {
			case "pop_front":
				System.out.println(DQ.popFront());
				break;
			case "pop_back":
				System.out.println(DQ.popBack());
				break;
			case "size":
				System.out.println(DQ.getSize());
				break;
			case "empty":
				System.out.println(DQ.isEmpty());
				break;
			case "front":
				System.out.println(DQ.peekFront());
				break;
			case "back":
				System.out.println(DQ.peekBack());
				break;
			default:
				String[] ord = order.split(" ");
				int x = Integer.parseInt(ord[1]);
				if(!(1 <= x && x <= 100000)) return;
				
				if("push_front".equals(ord[0])) {
					DQ.pushFront(x);
				} else if("push_back".equals(ord[0])) {
					DQ.pushBack(x);
				}
			}
		}
		

	}

}

class MyDeque {
	private Deque<Integer> myDeque;
	
	public MyDeque() {
		myDeque = new LinkedList<Integer>();
	}
	
	public void pushFront(int x) {
		myDeque.addFirst(x);
	}
	
	public void pushBack(int x) {
		myDeque.addLast(x);
	}
	
	public int popFront() {
		return !myDeque.isEmpty() ? myDeque.removeFirst() : -1;
	}
	
	public int popBack() {
		return !myDeque.isEmpty() ? myDeque.removeLast() : -1;
	}
	
	public int getSize() {
		return myDeque.size();
	}
	
	public int isEmpty() {
		return myDeque.isEmpty() ? 1 : 0;
	}
	
	public int peekFront() {
		return !myDeque.isEmpty() ? myDeque.peekFirst() : -1;
	}
	
	public int peekBack() {
		return !myDeque.isEmpty() ? myDeque.peekLast() : -1;
	}
}
