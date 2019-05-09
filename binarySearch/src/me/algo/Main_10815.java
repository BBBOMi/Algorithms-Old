package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        Set<Integer> set = new HashSet<Integer>();

        int num;
        for(int i=0; i<n; i++) {
            num = Integer.parseInt(str[i]);
            set.add(num);
        }

        int m = Integer.parseInt(br.readLine());
        str = br.readLine().split(" ");
        StringBuffer sb = new StringBuffer(m);
        for(int i=0; i<m; i++) {
            num = Integer.parseInt(str[i]);
            if(set.contains(num)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb.toString());
    }
}
