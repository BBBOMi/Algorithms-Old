package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-05-12.
 */
public class Main_3111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String t = br.readLine();

        StringBuilder sb = new StringBuilder(t);
        boolean front = true;
        int index;
        while(sb.indexOf(a) > -1) {
            if(front) {
                index = t.indexOf(a);
                sb.delete(index, index + a.length());
            } else {
                index = sb.lastIndexOf(a);
                sb.delete(index, index + a.length());
            }
            front = !front;
        }
        System.out.println(sb.toString());
    }
}
