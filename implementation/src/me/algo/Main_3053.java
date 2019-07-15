package me.algo;

import java.io.*;

/**
 * Created by bomi on 2019-07-15.
 */
public class Main_3053 {
    private static final double PI = Math.PI;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = Integer.parseInt(br.readLine());

        bw.write(String.format("%.6f \n", r*r*PI));
        bw.write(String.format("%.6f \n", (double)2*r*r));

        bw.close();
        br.close();
    }
}
