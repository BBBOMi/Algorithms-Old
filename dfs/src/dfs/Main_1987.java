/*
 * <문제> 세로 R칸, 가로 C칸으로 된 표 모양의 보드가 있다. 보드의 각 칸에는 대문자 알파벳이 하나씩 적혀 있고, 좌측 상단 칸 (1행 1열) 에는 말이 놓여 있다.
		말은 상하좌우로 인접한 네 칸 중의 한 칸으로 이동할 수 있는데, 새로 이동한 칸에 적혀 있는 알파벳은 지금까지 지나온 모든 칸에 적혀 있는 알파벳과는 달라야 한다. 즉, 같은 알파벳이 적힌 칸을 두 번 지날 수 없다.
		좌측 상단에서 시작해서, 말이 최대한 몇 칸을 지날 수 있는지를 구하는 프로그램을 작성하시오. 말이 지나는 칸은 좌측 상단의 칸도 포함된다.
 * <입력> 첫째 줄에 R과 C가 빈칸을 사이에 두고 주어진다. (1<=R,C<=20) 둘째 줄부터 R개의 줄에 걸쳐서 보드에 적혀 있는 C개의 대문자 알파벳들이 빈칸 없이 주어진다.
 * <출력> 첫째 줄에 말이 지날 수 있는 최대의 칸 수를 출력한다.
 */

package dfs;

import java.util.*;

public class Main_1987 {
	static int max = 1;
	static int count = 1;

	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();

		int r = Integer.parseInt(str.split(" ")[0]);
		int c = Integer.parseInt(str.split(" ")[1]);

		char[][] board = new char[r][c];
		boolean[] check = new boolean[26];

		for(int i=0; i<r; i++) {
			String s = sc.nextLine().trim();
			for(int j=0; j<c; j++) {
				board[i][j] = s.charAt(j);
			}
		}

		dfs(0, 0, board, check);
		System.out.println(max);
	}

	static void dfs(int x, int y, char[][] arr, boolean[] check) {
		check[arr[x][y] - 65] = true;

		for(int i=0; i<4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];

			if(nextX>=0 && nextX<arr.length && nextY>=0 && nextY<arr[0].length) {
				char c = arr[nextX][nextY];

				if(!check[c-65]) {
					max = Math.max(++count, max);
					dfs(nextX, nextY, arr, check);
				}
			}
		}
		count--;
		check[arr[x][y] - 65] = false;
	}

}