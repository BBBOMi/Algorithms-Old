package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bomi on 2019-05-10.
 */
public class Main_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        int num = 0;
        for(String s : arr) {
            if(map.containsKey(s)) {
                num = map.get(s);
            }
            map.put(s, num + 1);
            num = 0;
        }

        int m = Integer.parseInt(br.readLine());
        arr = br.readLine().split(" ");
        StringBuffer sb = new StringBuffer(m);
        for(String s : arr) {
            if(map.containsKey(s)) {
                num = map.get(s);
            }
            sb.append(num + " ");
            num = 0;
        }

        System.out.println(sb.toString());
    }
}
