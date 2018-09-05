package dynamicProgramming;

import java.util.*;

public class Main_6118 {
	static int[] distance;
	static boolean[] check;

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
		
		

	}
	
}
