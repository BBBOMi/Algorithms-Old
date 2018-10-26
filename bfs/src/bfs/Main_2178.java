/*
 * <문제> N×M크기의 배열로 표현되는 미로가 있다. 미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다.
 		이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오.
 		위의 예에서는 15칸을 지나야 (N, M)의 위치로 이동할 수 있다. 칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.
 * <입력> 첫째 줄에 두 정수 N, M(2 ≤ N, M ≤ 100)이 주어진다. 다음 N개의 줄에는 M개의 정수로 미로가 주어진다. 각각의 수들은 붙어서 입력으로 주어진다.
 * <출력> 첫째 줄에 지나야 하는 최소의 칸 수를 출력한다. 항상 도착위치로 이동할 수 있는 경우만 입력으로 주어진다.
 */
package bfs;

import java.util.*;

public class Main_2178 {

	static int n;
	static int m;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();

		n = Integer.parseInt(line.split(" ")[0]);
		m = Integer.parseInt(line.split(" ")[1]);

		arr = new int[n][m];

		for(int i=0; i<n; i++) {
			String str = sc.nextLine().trim();
			for(int j=0; j<m; j++) {
				arr[i][j] = str.charAt(j)-'0';
			}
		}
		bfs(0, 0);
	}

	static void bfs(int x, int y) {
		visited = new boolean[n][m];
		Queue<Pair> queue = new LinkedList<>();

		visited[x][y] = true;
		queue.add(new Pair(x, y));

		while(!queue.isEmpty()) {
			Pair p = queue.poll();

			for(int i=0; i<4; i++) {
				int nextX = p.x + dx[i];
				int nextY = p.y + dy[i];

				if((0<=nextX && nextX<n) && (0<=nextY && nextY<m)) {
					if(!visited[nextX][nextY] && arr[nextX][nextY] == 1) {
						queue.add(new Pair(nextX, nextY));
						visited[nextX][nextY] = true;
						arr[nextX][nextY] = arr[p.x][p.y] + 1;
					}
				}
			}
		}

		/*for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}*/
		System.out.println(arr[n-1][m-1]);
	}
}

class Pair {
	int x;
	int y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
