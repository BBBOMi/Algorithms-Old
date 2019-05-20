package me.algo;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by bomi on 2019-05-18.
 */
public class Main_1158b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        List<Integer> list = new LinkedList<>();
        for(int i=1; i<=n; i++) {
            list.add(i);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("<");
        int i=0;
        while(true) {
            i = (i + k - 1) % list.size();
            bw.write(list.remove(i) + "");

            if(list.size() == 0) {
                bw.write(">");
                break;
            }

            bw.write(", ");
        }

        bw.close();
    }
}
