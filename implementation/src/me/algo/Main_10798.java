package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bomi on 2019-05-15.
 */
public class Main_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = new char[225];

        for(int i=0; i<5; i++) {
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                char ch = str.charAt(i);
                arr[(j*5)+i] = ch;
            }
        }

        int i = 0;
        while(i < arr.length) {
            if(arr[i] != ' ') {
                System.out.print(arr[i]);
            }
            i++;
        }
    }
}
