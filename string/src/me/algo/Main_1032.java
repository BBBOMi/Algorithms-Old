package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-04-09.
 */
public class Main_1032 {
    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        StringBuffer sb = null;
                //new StringBuffer();

        for(int i=0; i<n; i++) {
            String str = br.readLine();
            if(i == 0) {
                System.out.println(i + " 1");
                sb = new StringBuffer(str.length());
                arr[i] = str;
                continue;
            }
            for(int j=0; j<str.length(); j++) {
                System.out.println(j + " 2");
                char ch1 = arr[i-1].charAt(j);
                char ch2 = str.charAt(j);

                if(ch1 == ch2) {
                    sb.append(ch2);
                } else {
                    sb.append('?');
                }
            }
        }

        System.out.println(sb.toString());
    }
}
