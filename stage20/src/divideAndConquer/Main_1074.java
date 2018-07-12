/* <문제> 한수는 2차원 배열 (항상 2^N * 2^N 크기이다)을 Z모양으로 탐색하려고 한다.
 	예를 들어, 2*2배열을 왼쪽 위칸, 오른쪽 위칸, 왼쪽 아래칸, 오른쪽 아래칸 순서대로 방문하면 Z모양이다.
 	만약, 2차원 배열의 크기가 2^N * 2^N라서 왼쪽 위에 있는 칸이 하나가 아니라면, 배열을 4등분 한 후에 (크기가 같은 2^(N-1)로) 재귀적으로 순서대로 방문한다.
	N이 주어졌을 때, (r, c)를 몇 번째로 방문하는지 출력하는 프로그램을 작성하시오.
 * <입력> 첫째 줄에 N r c가 주어진다. N은 15보다 작거나 같은 자연수이고, r과 c는 0보다 크거나 같고, 2^N-1보다 작거나 같은 정수이다
 * <출력> 첫째 줄에 문제의 정답을 출력한다.
 */
package divideAndConquer;

import java.util.*;

public class Main_1074 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();
		String[] numbers = line.split(" ");
		
		int n = Integer.parseInt(numbers[0]);
		int r = Integer.parseInt(numbers[1]);
		int c = Integer.parseInt(numbers[2]);
		
		int size = (int)Math.pow(2, n);
		if((n<1 || 15<n) || (0>r || 0>c || size-1<r || size-1<c)) return;
		
		int result = visited(n, r, c);
		System.out.println(result);
	}
	
	public static int log(int n ,int base) {
		return (int)(Math.log(n) / Math.log(base));
	}
	
	public static int visited(int n, int r, int c) {
		int value = 0;
		while(true) {
			int r1 = (int)Math.pow(2, log(r, 2));
			int c1 = (int)Math.pow(2, log(c, 2));		
			r1 = (r1 < c1) ? 0 : r1;
			c1 = (c1 < r1) ? 0 : c1;
			int R1 = (r1 == 0) ? 0 : (int)Math.pow(2, log(r1, 2) * 2 + 1);
			int C1 = (c1 == 0) ? 0 : (int)Math.pow(2, log(c1, 2) * 2);
			value += R1 + C1;
			if(r1 == r && c1 == c) return value;
			r -= r1;
			c -= c1;
		}
	}
}		


