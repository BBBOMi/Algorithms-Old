package bfs;

import java.io.*;

import java.util.*;

public class Main_1260 {
	private static int[][] arr;
	private static boolean[] visited;
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];

		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());

			arr[n1][n2] = arr[n2][n1] = 1;
		}

		dfs(v);
		bw.write("\n");
		Arrays.fill(visited, false);
		bfs(v);

		bw.close();
		br.close();
	}

	private static void dfs(int v) throws IOException {
		visited[v] = true;
		bw.write(v + " ");

		for(int i=1, len=arr.length; i<len; i++) {
			if(!visited[i] && arr[v][i]==1) {
				dfs(i);
			}
		}
	}

	private static void bfs(int v) throws IOException {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(v);
		visited[v] = true;

		while(!queue.isEmpty()) {
			int temp = queue.poll();
			bw.write(temp + " ");
			for(int i=1, len=arr.length; i<len; i++) {
				if(!visited[i] && arr[temp][i]==1) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
}
