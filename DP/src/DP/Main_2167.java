package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-05-05.
 */
public class Main_2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int[][] arr = new int[n+1][m+1];

        for(int i=1; i<=n; i++) {
            str = br.readLine().split(" ");
            for(int j=1; j<=m; j++) {
                arr[i][j] = Integer.parseInt(str[j-1]);
            }
        }

        int k = Integer.parseInt(br.readLine());
        int i, j, x, y;
        for(int l=0; l<k; l++) {
            str = br.readLine().split(" ");
            i = Integer.parseInt(str[0]);
            j = Integer.parseInt(str[1]);
            x = Integer.parseInt(str[2]);
            y = Integer.parseInt(str[3]);

            int[][] dp = new int[n+1][m+1];
            for(int a=i; a<=x; a++) {
                for(int b=j; b<=y; b++) {
                    if(a == x && b == y) {
                        dp[a][b] = dp[a-1][b] + dp[a][b-1] + arr[a][b];
                        //System.out.println(dp[a][b]);
                        continue;
                    }
                    dp[a][b] = dp[a][b-1] + arr[a][b];
                }
            }
        }
    }
}
