package dfs;

import java.io.*;

/**
 * Created by bomi on 2019-09-01.
 */
public class Main_2606b {
    private static boolean[] visited;
    private static int[][] networks;
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computersNumber = Integer.parseInt(br.readLine());
        int networksNumber = Integer.parseInt(br.readLine());

        networks = new int[computersNumber+1][computersNumber+1];
        for(int i=0, computer1, computer2; i<networksNumber; i++) {
            String[] computers = br.readLine().split(" ");
            computer1 = Integer.parseInt(computers[0]);
            computer2 = Integer.parseInt(computers[1]);

            networks[computer1][computer2] = networks[computer2][computer1] = 1;
        }

        visited = new boolean[computersNumber+1];
        dfs(1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(count + "\n");
        bw.close();
        br.close();
    }

    private static void dfs(int start) {
        visited[start] = true;
        for(int i=1; i<visited.length; i++) {
            if((networks[start][i] == 1) && !visited[i]) {
                System.out.println(i);
                count++;
                dfs(i);
            }
        }
    }
}
