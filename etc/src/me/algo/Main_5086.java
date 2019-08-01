package me.algo;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-08-01.
 */
public class Main_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(StringTokenizer st = new StringTokenizer(br.readLine()); ; st = new StringTokenizer(br.readLine())) {
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == b) {
                bw.close();
                br.close();
                return;
            }

            if(b % a == 0) {
                bw.write("factor" + "\n");
                continue;
            }
            if(a % b == 0) {
                bw.write("multiple" + "\n");
                continue;
            }

            bw.write("neither" + "\n");
        }
    }
}
