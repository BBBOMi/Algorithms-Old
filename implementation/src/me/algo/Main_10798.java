package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-05-15.
 */
public class Main_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];

        for(int i=0; i<arr.length; i++) {
            String str = br.readLine();
            int len = str.length();
            for(int j=0; j<arr[0].length; j++) {
                if(len <= j) {
                    arr[i][j] = '!';
                } else {
                    arr[i][j] = str.charAt(j);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr[0].length; i++) {
            for(int j=0; j<5; j++) {
                if(arr[j][i] == '!') {
                    continue;
                }
                sb.append(arr[j][i]);
            }
        }

        System.out.println(sb.toString());
    }
}
