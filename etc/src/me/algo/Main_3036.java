package me.algo;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-07-31.
 */
public class Main_3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        for(int i=1; i<n; i++) {
            String cycle = cycleCalculate(first, Integer.parseInt(st.nextToken()));
            bw.write(cycle + "\n");
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
    private static String cycleCalculate(int a, int b) {
        int gcd = gcd(a, b);
        StringBuilder sb = new StringBuilder()
                .append((a/gcd))
                .append('/')
                .append((b/gcd));
        return sb.toString();
    }
}
