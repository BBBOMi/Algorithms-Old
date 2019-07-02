package me.algo;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by bomi on 2019-07-02.
 */
public class Main_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            String str = br.readLine();
            List<Character> list = new LinkedList<>();
            ListIterator<Character> it = list.listIterator();
            for(int j=0; j<str.length(); j++) {
                char c = str.charAt(j);

                if(c == '<') {
                    if(it.hasPrevious()) {
                       it.previous();
                    }
                    continue;
                }

                if(c == '>') {
                    if(it.hasNext()) {
                        it.next();
                    }
                    continue;
                }

                if(c == '-') {
                    if(it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                    continue;
                }

                it.add(c);
            }

            for(char c : list) {
                bw.write(c + "");
            }

            bw.write("\n");
        }

        bw.close();
    }
}
