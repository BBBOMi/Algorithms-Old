package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-05-15.
 */
public class Main_10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<n; i++) {
            String s = br.readLine();
            if("1".equals(s)) {
                count++;
            }
        }

        System.out.println(count > n/2 ? "Junhee is cute!" : "Junhee is not cute!");


    }
}
