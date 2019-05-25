package me.algo;

import java.io.*;
import java.util.Scanner;

/**
 * Created by bomi on 2019-05-25.
 */
public class Main_10820 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc  = new Scanner(System.in);

        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            int lower = 0, upper = 0, number = 0, ws = 0;
            for(int j=0; j<s.length(); j++) {
                char c = s.charAt(j);
                if('0' <= c && c <= '9') {
                     number++;
                } else if('A' <= c && c <= 'Z') {
                    upper++;
                } else if('a' <= c && c <= 'z') {
                    lower++;
                } else if(c == ' ') {
                    ws++;
                }
            }
            bw.write(lower + " " + upper + " " + number + " " + ws + "\n");
        }
        bw.close();
    }
}
