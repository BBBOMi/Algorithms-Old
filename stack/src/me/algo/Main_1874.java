/* <문제> 1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 이 때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자.
 * 임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.
 * 
 * <입력> 첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 물론 같은 정수가 두 번 나오는 일은 없다.
 * <출력> 입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.
 */

package me.algo;

import java.util.*;

public class Main_1874 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayList<String> result = makeSequence(arr);
		for(int i=0; i<result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

	public static ArrayList<String> makeSequence(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int value = 0;
		ArrayList<String> list = new ArrayList<>();

		for(int i=0; i<arr.length; i++) {
			if(value < arr[i]) {
				for(int j=value+1; j<=arr[i]; j++) {
					s.push(j);
					list.add("+");
					value++;
				}
			}

			if(!s.isEmpty() && s.peek() == arr[i]) {
				s.pop();
				list.add("-");
			} else {
				list.clear();
				list.add("NO");
				break;
			}
		}

		return list;
	}

}
