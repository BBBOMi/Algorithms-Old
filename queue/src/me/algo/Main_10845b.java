package me.algo;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by bomi on 2019-05-17.
 */

public class Main_10845b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> queue = new LinkedList<>();

        for(int i=0; i<n; i++) {
            String[] str = br.readLine().split(" ");
            switch(str[0]) {
                case "push":
                    queue.offer(Integer.parseInt(str[1]));
                    break;
                case "pop":
                    bw.write(queue.isEmpty() ? "-1\n" : queue.poll() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write(queue.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    bw.write(queue.isEmpty() ? "-1\n" : queue.peek()+ "\n");
                    break;
                case "back":
                    bw.write(queue.isEmpty() ? "-1\n" : queue.peekLast() + "\n");
                    break;
            }
        }
        bw.close();
    }

}
