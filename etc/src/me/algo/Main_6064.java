package me.algo;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-08-01.
 */
public class Main_6064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int result = -1;
            int cycle = N / gcd(M, N);
            for(int j=0, year; j<cycle; j++) {
                year = M * j + x;
                if((year - y) % N == 0) {
                    result = year;
                }
            }
            bw.write(result + "\n");
        }
        bw.close();
        br.close();
    }

    private static int gcd(int a, int b) {
        int t;
        while(b != 0) {
            t = a % b;

            a = b;
            b = t;
        }
        return a;
    }
}
