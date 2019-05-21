package me.algo;

import java.io.*;

/**
 * Created by bomi on 2019-05-21.
 */
public class Main_10808b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = new char[26];

        for(char ch : s.toCharArray()) {
            arr[ch - 97]++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i : arr) {
            bw.write(i + " ");
        }

        bw.close();
    }
}
