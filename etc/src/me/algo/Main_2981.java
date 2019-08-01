package me.algo;

import java.io.*;
import java.util.*;

/**
 * Created by bomi on 2019-07-31.
 */
public class Main_2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        for(int i=1; i<n; i++) {
            arr[i-1] = arr[i] - arr[i-1];
        }

        int gcd = findGcd(arr);
        Set<Integer> set = makeDivisorSet(gcd);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(Integer aSet : set) {
            bw.write(aSet + " ");
        }

        bw.close();
        br.close();
    }

    private static int findGcd(int... arr) {
        int length = arr.length - 1;
        int result = arr[0];
        for(int i=1; i<length; i++) {
            result = findGcd(result, arr[i]);
        }
        return result;
    }

    private static int findGcd(int a, int b) {
        int t;
        while(b != 0) {
            t = a % b;

            a = b;
            b = t;
        }
        return a;
    }

    private static Set<Integer> makeDivisorSet(int gcd) {
        Set<Integer> set = new TreeSet<>();
        int max = (int)Math.sqrt(gcd);
        for(int i=2; i<=max; i++) {
            if(gcd%i == 0) {
                set.add(i);
                set.add(gcd/i);
            }
        }
        set.add(gcd);
        return set;
    }

}
