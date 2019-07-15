package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-07-15.
 */
public class Main_2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        boolean[] arr = new boolean[n+1];

        for(int i=2; i<=n; i++) {
            arr[i] = true;
        }
        for(int i=2; i<=n; i++) {
            for(int j=i; j<=n; j+=i) {
                if(arr[j]) {
                    arr[j] = false;
                    k--;
                }

                if(k == 0) {
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}
