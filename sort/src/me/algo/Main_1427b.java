package me.algo;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by bomi on 2019-08-05.
 */
public class Main_1427b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] numbers = br.readLine().toCharArray();

        Arrays.sort(numbers);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=numbers.length-1; i>=0; i--) {
            bw.write(numbers[i]+"");
        }
        bw.close();
        br.close();
    }
}
