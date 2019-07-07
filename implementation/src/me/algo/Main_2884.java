package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-07-07.
 */
public class Main_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int h = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        if(m < 45) {
            m += 60;
            if(--h == -1) {
                h = 23;
            }
        }

        System.out.println(h + " " + (m - 45));
    }
}
