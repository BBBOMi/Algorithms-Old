package me.algo;

import java.io.*;
import java.util.Arrays;

/* 문제 출처 - https://www.acmicpc.net/problem/2309 */

public class Main_2309 {
    static final int MAX = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] heights = new int[9];
        int sum = 0;
        for(int i=0; i<heights.length; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            sum += heights[i];
        }

        Arrays.sort(heights);

        boolean[] check = new boolean[heights.length];
        findDwarfs(heights, check, sum);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<check.length; i++) {
            if(!check[i]) {
                bw.write(heights[i] + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void findDwarfs(int[] heights, boolean[] check, int sum) {
        for(int i=0; i<heights.length-1; i++) {
            for(int j=i+1; j<heights.length; j++) {
                if(MAX == (sum-heights[i]-heights[j])) {
                    check[i] = check[j] = true;
                    return;
                }
            }
        }
    }
}
