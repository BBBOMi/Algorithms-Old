package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bomi on 2019-06-05.
 */
public class Main_1032b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<String>();
        for(int i=0; i<n; i++) {
            list.add(br.readLine());
        }

        String str;
        StringBuilder sb = new StringBuilder(list.get(0));
        for(int i=1; i<n; i++) {
            str = list.get(i);
            for(int j=0; j<str.length(); j++) {
                if(sb.charAt(j) != str.charAt(j)) {
                    sb.replace(j, j+1, "?");
                }
            }
        }

        System.out.println(sb.toString());
    }

}
