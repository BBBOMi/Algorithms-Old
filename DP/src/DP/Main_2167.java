package DP;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-05-05.
 */
public class Main_2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] dp = new int[n+1][m+1];

        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=m; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
                dp[i][j] += Integer.parseInt(st.nextToken());
            }
        }

        int i, j, x, y;
        int k = Integer.parseInt(br.readLine());
        for(int l=0; l<k; l++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            int result = dp[x][y] - dp[i-1][y] - dp[x][j-1] + dp[i-1][j-1];
            bw.write(result + "\n");
        }
        bw.close();
        br.close();
    }
}
