package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-06-05.
 */
public class Main_1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        StringBuilder a = new StringBuilder(str[0]);
        String b = str[1];
        int len = b.length() - a.length();
        int count = 50;
        int tmp = 0;
        for(int i=len; i>=0; i--) {
            for(int j=0; j<a.length(); j++) {
                if(a.charAt(j) != b.charAt(j)) {
                    if(a.charAt(j) == ' ') continue;
                    tmp++;
                }
            }
            if(count > tmp) {
                count = tmp;
            }

            if(i == 0) break;

            tmp = 0;
            a.insert(0, " ");
        }
        System.out.println(count);
    }
}
