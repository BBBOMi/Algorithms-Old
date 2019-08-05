package me.algo;

import java.io.*;
import java.util.*;

/**
 * Created by bomi on 2019-08-05.
 */
public class Main_2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new PriorityQueue<>();
        StringTokenizer st;
        for(int i=0, num; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                num = Integer.parseInt(st.nextToken());
                if(queue.size() < n) {
                    queue.offer(num);
                    continue;
                }
                if(queue.peek() < num) {
                    queue.poll();
                    queue.offer(num);
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(queue.peek() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
