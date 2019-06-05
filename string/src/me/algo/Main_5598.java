package me.algo;

import java.io.*;

/**
 * Created by bomi on 2019-06-05.
 */
public class Main_5598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 'C') {
                arr[i] -= 3;
                continue;
            }
            arr[i] += 23;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(char ch : arr) {
            bw.write(ch +"");
        }

        bw.close();
    }
}
