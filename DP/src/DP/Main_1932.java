package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-04-07.
 */
public class Main_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+1][n+1];

        StringTokenizer st;
        int max = 0;
        for(int i=1; i<=n; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            for(int j=1; j<=i; j++) {
                if(j == 0) {
                    arr[i][j] = Integer.parseInt(st.nextToken()) + arr[i-1][j];
                } else if(j == i) {
                    arr[i][j] = Integer.parseInt(st.nextToken()) + arr[i-1][j-1];
                } else {
                    arr[i][j] = Integer.parseInt(st.nextToken()) + Math.max(arr[i-1][j-1], arr[i-1][j]);
                }
            }

            if(i == n) {
                for(int j=1; j<=i; j++) {
                    if(max < arr[i][j])
                        max = arr[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
