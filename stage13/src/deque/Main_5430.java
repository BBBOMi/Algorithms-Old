/* <문제> 두 가지 함수 R(뒤집기)과 D(버리기)가 있다.
  	함수 R은 배열에 있는 숫자의 순서를 뒤집는 함수이고, D는 첫 번째 숫자를 버리는 함수이다. 배열이 비어있는데 D를 사용한 경우에는 에러가 발생한다.
  	함수는 조합해서 한 번에 사용할 수 있다. 예를 들어, "AB"는 A를 수행한 다음에 바로 이어서 B를 수행하는 함수이다. 예를 들어, "RDD"는 배열을 뒤집은 다음 처음 두 숫자를 버리는 함수이다.
  	배열의 초기값과 수행할 함수가 주어졌을 때, 최종 결과를 구하는 프로그램을 작성하시오.
 
 * <입력> 첫째 줄에 테스트 케이스의 개수 T가 주어진다. T는 최대 100이다.
  	각 테스트 케이스의 첫째 줄에는 수행할 함수 p가 주어진다. p의 길이는 1보다 크거나 같고, 100,000보다 작거나 같다.
  	다음 줄에는 배열에 들어있는 수의 개수 n이 주어진다. (0 ≤ n ≤ 100,000)
	다음 줄에는 [x1,...,xn]과 같은 형태로 배열에 들어있는 수가 주어진다. (1 ≤ xi ≤ 100)

 * <출력> 각 테스트 케이스에 대해서, 입력으로 주어진 정수 배열에 함수를 수행한 결과를 출력한다.
  	만약, 에러가 발생한 경우에는 error를 출력한다.
 */
package deque;

import java.util.*;

public class Main_5430 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine().trim());
		if(100 < t) return;
		
		for(int i=0; i<t; i++) {
			String p = sc.nextLine().trim(); // 함수
			if(!((1 <= p.length()) && p.length() <= 1000000)) return;
			
			int n = Integer.parseInt(sc.nextLine().trim()); // 배열 안의 수의 개수
			if(!((0 <= n) && (n <= 1000000))) return;
			
			String arr = sc.nextLine().trim();
			
			System.out.println(function(p, arr));
		}

	}
	
	public static String function(String p, String arr) {
		String number = arr.replace("[", "").replace("]", "");
		String[] numbers = number.split(",");
		
		Deque<String> deque = new LinkedList<>();
		for(int i=0; i<numbers.length; i++) {
			deque.addLast(numbers[i]);
		}
		
		boolean frontIndex = true;
		for(int i=0; i<p.length(); i++) {
			char ch = p.charAt(i);
			if(ch == 'R') {
				frontIndex = !frontIndex;
			} else if(ch == 'D') {
				if(deque.isEmpty() || deque.peek().equals(""))
					return "error";
				else if(frontIndex){
					deque.removeFirst();
				} else
					deque.removeLast();
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		
		Iterator<String> it = null;
		if(frontIndex) it = deque.iterator();
		else  it = deque.descendingIterator();
		
		while(it.hasNext()) {
			sb.append(it.next());
			if(it.hasNext()) sb.append(",");
		}
		
		sb.append(']');
		
		return sb.toString();
	}

}
