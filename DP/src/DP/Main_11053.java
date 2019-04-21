package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-04-21.
 */

public class Main_11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        int maxLength = 0;

        for(int i=1; i<arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i-1]);
            for(int j=1; j<i; j++) {
                if(arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            if(dp[i] == 0) dp[i] = 1;
            if(maxLength < dp[i]) maxLength = dp[i];
        }

        System.out.println(maxLength);
    }

}
