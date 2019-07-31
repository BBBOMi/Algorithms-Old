package me.algo;

import java.io.*;
import java.util.StringTokenizer;

public class Main_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0, a, b; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bw.write(lcm(a, b) + "\n");
        }

        bw.close();
        br.close();
    }

    private static long lcm(int a, int b) {
        return (a * b) / gcd(a, b);
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
