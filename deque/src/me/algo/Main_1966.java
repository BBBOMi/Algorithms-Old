package me.algo;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-07-05.
 */
public class Main_1966 {

    static class File {
        int priority;
        int index;

        File(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Deque<File> printer = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                printer.offer(new File(j, Integer.parseInt(st.nextToken())));
            }

            bw.write(print(printer, m) + "\n");
        }
        bw.close();
    }

    static int print(Deque<File> printer, int index) {
        int max;
        int count = 1;

        while(!printer.isEmpty()) {
            max = findPriority(printer);
            File file = printer.pollFirst();

            if(file.priority == max) {
                if(file.index == index) {
                    return count;
                }
                count++;
                continue;
            }
            printer.offer(file);
        }
        return -1;
    }

    static int findPriority(Deque<File> printer) {
        int max = 0;
        for(File f : printer) {
            if(max < f.priority) {
                max = f.priority;
            }
        }
        return max;
    }
}
