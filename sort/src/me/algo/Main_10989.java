package me.algo;

import java.io.*;

/**
 * Created by bomi on 2019-07-16.
 */
public class Main_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        countingSort(arr, 10000);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i : arr) {
            bw.write(i + "\n");
        }

        bw.close();
        br.close();
    }

    private static void countingSort(int[] arr, int maxValue) {
        int n = arr.length;
        int[] count = new int[maxValue + 1];
        for(int i=0; i<n; i++) {
            count[arr[i]]++;
        }

        int ind = 0;
        n = count.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<count[i]; j++) {
                arr[ind++] = i;
            }
        }
    }
}
