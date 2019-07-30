package dfs;

import java.io.*;
import java.util.*;

/**
 * Created by bomi on 2019-07-30.
 */
public class Main_2606 {
    private static List<Integer>[] arr;
    private static Set<Integer> visited = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new List[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0, len=Integer.parseInt(st.nextToken()); i<len; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            if(arr[n1] == null) arr[n1] = new ArrayList<>();
            if(arr[n2] == null) arr[n2] = new ArrayList<>();

            arr[n1].add(n2);
            arr[n2].add(n1);
        }

        dfs(1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(visited.size() - 1 + "\n");
        bw.close();
        br.close();
    }

    private static void dfs(int start) {
        if(visited.contains(start)) {
            return;
        }
        visited.add(start);
        for(int i: arr[start]) {
            if(!visited.contains(i))
                dfs(i);
        }
    }
}
