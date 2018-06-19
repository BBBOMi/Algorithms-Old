package queue;

import java.util.*;

public class Main_1260 {
	static int[][] graph;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Line = sc.nextLine().trim();
		String[] value = Line.split(" ");
		
		int n = Integer.parseInt(value[0]);
		if(n < 0 || 1000 < n) return;
		
		graph = new int[n][n];
		visited = new boolean[n];
		
		int m = Integer.parseInt(value[1]);
		if(m < 0 || 10000 < m) return;
		
		for(int i=0; i<m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			graph[v1-1][v2-1] = graph[v2-1][v1-1] = 1;		
		}
		
		int v = Integer.parseInt(value[2]);
		
		DFS(v); System.out.println();
		BFS(v);
	}
	
	public static void DFS(int v) {
		visited[v-1] = true;
		System.out.println(v + " ");
		
		for(int i=0; i<graph.length; i++) {
			if(!visited[i] && graph[v-1][i] == 1) {
				DFS(i);
			}
		}
	}
	
	public static void BFS(int v) {
		
	}

}

