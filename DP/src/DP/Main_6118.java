package DP;

import java.util.*;

public class Main_6118 {
	static int[] distance;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next().trim());
		int m = Integer.parseInt(sc.next().trim());

		Map<Integer, List<Integer>> graph = new TreeMap<>();
		for(int i=0; i<n; i++) {
			graph.put(i+1, new LinkedList<>());
		}

		for(int i=0; i<m; i++) {
			int v1 = Integer.parseInt(sc.next().trim());
			int v2 = Integer.parseInt(sc.next().trim());
			graph.get(v1).add(v2);
			graph.get(v2).add(v1);
		}

		for(int i=0; i<graph.size(); i++) {
			System.out.println(i+1 + " -> " + graph.get(i+1).toString());
		}

		distance = new int[graph.size()];
		visited = new boolean[graph.size()];

		for(int i=0; i<distance.length; i++) {
			distance[i] = 1;
		}

		distance[0] = 0;
		visited[0] = true;

		for(int i=0; i<n-1; i++) {
			for(int j=0; i<graph.get(1).size(); j++) {
				//if(!visited[graph.get(1).get(j)])
			}


		}

		/*int i=0;
		int count = 0;

		distance[i] = 0;
		check[i] = true;

		List<Integer> list = new ArrayList<>();
		while() {
			list = graph.get(i);
			count++;
			int min = Integer.MAX_VALUE;
			int min_ind = -1;
			for(int j=0; j<list.size(); j++) {
				int ind = list.get(j);
				distance[ind] = count;
				if(!check[ind] && distance[ind] < min) {
					min = distance[ind];
					min_ind = ind;
				}
			}

			check[min_ind] = true;
			i = min_ind;
		}
		 */		

	}

	static void BFS(int v, Map<Integer, List<Integer>> g) {
		Queue<Integer> queue = new LinkedList<>();

		//check[v] = true;
		queue.add(v);
		while(!queue.isEmpty()) {
			v = queue.poll();
			for(int j=0; j<g.get(v).size(); j++) {
				//if(!check[g.get(v).get(j)]) {
				//check[g.get(v).get(j)] = true;
				//queue.add(g.get())
			}
		}
	}
}



