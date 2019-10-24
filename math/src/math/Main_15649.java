package math;

import java.io.*;
import java.util.*;

/**
 * Created by bomi on 2019-10-24.
 */
public class Main_15649 {
    private static int n;
    private static int m;
    private static  StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[n + 1];
        int[] order = new int[m];
        solution(0,0, order, visited);

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    private static void solution(int index, int count, int[] order, boolean[] visited) {
        if(m == count) {
            for(int i=0; i < m; i++) {
                sb.append(order[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1; i<=n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                order[index] = i;
                solution(index+1,count+1, order, visited);

                order[index] = 0;
                visited[i] = false;
            }
        }
    }
}
