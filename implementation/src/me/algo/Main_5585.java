package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-07-07.
 */
public class Main_5585 {
    static final int[] MONEY = {500, 100, 50, 10, 5, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        n = 1000 - n;

        int count = 0;
        int index = 0;
        while(n != 0) {
            if(n - MONEY[index] >= 0) {
                n -= MONEY[index];
                count++;
                continue;
            }
            index++;
        }
        System.out.println(count);
    }
}
