package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main_1260 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		int v = Integer.parseInt(line[2]);
		
		List<Integer> list = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			list.add(i);
		}
		
		for(int i=0; i<m; i++) {
			String[] edge = br.readLine().split(" ");
			int t = Integer.parseInt(edge[0]);
			int f = Integer.parseInt(edge[1]);
			
			//list.
		}
	}

}
