package me.algo;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by bomi on 2019-08-05.
 */
public class Main_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++) {
            String[] st = br.readLine().split(" ");

            arr[i][0] = Integer.parseInt(st[0]);
            arr[i][1] = Integer.parseInt(st[1]);
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] != o2[1])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int[] i : arr) {
            bw.write(i[0] + " " + i[1] + '\n');
        }

        bw.close();
        br.close();
    }
}
