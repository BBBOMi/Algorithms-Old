/*
 * <문제> 1.지민이가 가지고 있는 막대의 길이를 모두 더한다. 처음에는 64cm 막대 하나만 가지고 있다. 이때, 합이 X보다 크다면, 아래와 같은 과정을 반복한다.
 			1.가지고 있는 막대 중 길이가 가장 짧은 것을 절반으로 자른다.
			2.만약, 위에서 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이의 합이 X보다 크거나 같다면, 위에서 자른 막대의 절반 중 하나를 버린다.
		2.이제, 남아있는 모든 막대를 풀로 붙여서 Xcm를 만든다.
		X가 주어졌을 때, 위의 과정을 거친다면, 몇 개의 막대를 풀로 붙여서 Xcm를 만들 수 있는지 구하는 프로그램을 작성하시오. 
 * <입력> 첫째 줄에 X가 주어진다. X는 64보다 작거나 같은 자연수이다.
 * <출력> 문제의 과정을 거친다면, 몇 개의 막대를 풀로 붙여서 Xcm를 만들 수 있는지 출력한다.
 */
package simulation;

import java.util.*;

public class Main_1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> bars = new ArrayList<>();
		int sum;

		int x = sc.nextInt();
		bars.add(64);

		while(true) {
			sum = 0;
			for(int i=0; i<bars.size(); i++) {
				sum += bars.get(i);
			}

			if(sum > x) {
				int lastBar = bars.remove(bars.size()-1);
				int newBar = lastBar/2;
				sum -= lastBar;

				if(sum+newBar >= x) {
					bars.add(newBar);
					sum += newBar;
				} else {
					bars.add(newBar);
					bars.add(newBar);
					sum += lastBar;
				}
			}

			if(x == sum) {
				break;
			}
		}
		System.out.println(bars.size());

	}

}