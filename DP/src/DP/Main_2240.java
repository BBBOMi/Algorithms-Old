package DP;

import java.util.Scanner;

/**
 * Created by bomi on 2018-11-26.
 */

public class Main_2240 {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.next().trim());
    int w = Integer.parseInt(sc.next().trim());

    int[][] arr = new int[t][2];
    int[][] dp = new int[t+1][3];

    for(int i=0; i < t; i++) {
        int n = sc.nextInt();
        arr[i][n-1] = 1;
    }

    int treeNum;
    int move = 0;
    int p = 1;
    for(int i=1; i < dp.length; i++) {
        treeNum = arr[i-1];
        if(move < w) {
            dp[i][treeNum] = Math.max(dp[i-1][1] + 1 , dp[i-1][2] + 1);
        }
    }

    



}
