package me.algo;

import java.io.*;

/**
 * Created by bomi on 2019-07-31.
 */
public class Main_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int n1 = Integer.parseInt(arr[0]);
        int n2 = Integer.parseInt(arr[1]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(gcd(n1, n2) + "\n");
        bw.write(lcm(n1, n2) + "\n");

        bw.close();
        br.close();
    }

    private static int gcd(int n1, int n2) {
        int t;
        while(n2 != 0) {
            t = n1 % n2;

            n1 = n2;
            n2 = t;
        }
        return n1;
    }

    private static int lcm(int n1, int n2) {
        return (n1 * n2) / gcd(n1, n2);
    }
}
