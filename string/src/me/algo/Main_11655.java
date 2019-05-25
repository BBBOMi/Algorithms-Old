package me.algo;

import java.io.*;

/**
 * Created by bomi on 2019-05-25.
 */
public class Main_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        for(int i=0; i<arr.length; i++) {
            if('A' <= arr[i] && arr[i] <= 'Z') {
                if(arr[i] < 'N') {
                    arr[i] += 13;
                    continue;
                }
                arr[i] -= 13;
            } else if('a' <= arr[i] && arr[i] <= 'z') {
                if(arr[i] <'n') {
                    arr[i] += 13;
                    continue;
                }
                arr[i] -= 13;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(char ch : arr) {
            bw.write(ch);
        }
        bw.close();
    }
}
