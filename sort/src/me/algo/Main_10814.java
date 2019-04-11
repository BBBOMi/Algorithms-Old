package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by bomi on 2019-04-11.
 */
public class Main_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Object[][] arr = new Object[n][2];

        for(int i=0; i<arr.length; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = s[1];
        }

        Arrays.sort(arr, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                int a = (Integer)o1[0];
                int b = (Integer)o2[0];

                if(a == b) return 0;
                return Integer.compare(a, b);
            }
        });

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}

