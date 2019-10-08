package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-10-07.
 */
public class Main_13023 {
    private static List<Integer>[] people;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());

        people = new List[n];
        visited = new boolean[n];

        for(int i=0, m=Integer.parseInt(st.nextToken()); i<m; i++) {
            makeFriends(br.readLine());
        }

        int result = 0;
        for(int i=0; i<n; i++) {
            result = DFS(i, 1);
            if(result == 1) {
                break;
            }
        }

        System.out.println(result);

    }

    private static void makeFriends(String friend) {
        StringTokenizer st = new StringTokenizer(friend, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(people[a] == null) {
            people[a] = new ArrayList<>();
        }
        if(people[b] == null) {
            people[b] = new ArrayList<>();
        }

        people[a].add(b);
        people[b].add(a);
    }

    private static int DFS(int v, int depth) {
        if(depth == 5) {
            return 1;
        }

        visited[v] = true;

        for(int friend : people[v]) {
            if(!visited[friend]) {
                int check = DFS(friend, depth + 1);
                if(check == 1) {
                    return 1;
                }
            }
        }

        visited[v] = false;
        return 0;
    }

}
