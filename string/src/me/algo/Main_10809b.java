package me.algo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bomi on 2019-05-25.
 */
public class Main_10809b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] arr = new int[26];
        boolean[] check = new boolean[26];
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(!check[ch - 97]) {
                check[ch - 97] = true;
                arr[ch - 97] = i;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<arr.length; i++) {
            if(check[i]) {
                bw.write(arr[i] + " ");
                continue;
            }
            bw.write("-1 ");
        }
        bw.close();
    }

}
