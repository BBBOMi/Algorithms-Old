package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-04-08.
 */
public class Main_2163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int max =  n < m ? m : n;
        int[][] dp = new int[max+1][max+1];

        for(int i=1; i<=max; i++) {
            for(int j=i; j>0; j--) {
                if(i == j) {
                    dp[i][j] = (i * i) - 1;
                } else {
                    dp[i][j] = dp[i][j+1] - i;
                }
            }
        }
        int result = dp[n][m] == 0 ? dp[m][n] : dp[n][m];
        System.out.println(result);
    }
}
