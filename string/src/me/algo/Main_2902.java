package me.algo;

import java.io.*;

/**
 * Created by bomi on 2019-06-05.
 */
public class Main_2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("-");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(String s : str) {
            bw.write(s.charAt(0) + "");
        }
        bw.close();
    }
}
