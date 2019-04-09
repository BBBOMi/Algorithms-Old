package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-04-09.
 */

public class Main_1100 {

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        //boolean[][] arr = new boolean[8][8];

        for(int i=0; i<8; i++) {
            String[] str = br.readLine().split("");
            for(int j=0; j<str.length; j++) {
                if(i%2 == 0 && j%2 == 0 || i%2 != 0 && j%2 != 0) {
                    if(str[j].equals("F")) count++;
                }
            }
        }

        System.out.println(count);
    }
}
