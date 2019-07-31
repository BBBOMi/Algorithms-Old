package me.algo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-07-31.
 */
public class Main_5618 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> divisors = divisors(gcd(arr));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i : divisors) {
            bw.write(i + "\n");
        }

        bw.close();
        br.close();
    }

    private static List<Integer> divisors(int num) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    private static int gcd(int[] arr) {
        int result = arr[0];
        for(int i=1, len=arr.length; i<len; i++) {
            result = gcd(result, arr[i]);
        }
        return result;
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
