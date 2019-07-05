package me.algo;

import java.io.*;
import java.util.*;

/**
 * Created by bomi on 2019-07-05.
 */
public class Main_5430b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> list = makeQueue(br.readLine());

            bw.write(result(p, list) + "\n");
        }

        bw.close();
    }

    static String result(String cmd, Deque<Integer> list) {
        boolean head = true;
        for(char c : cmd.toCharArray()) {
            if(c == 'R') {
                head = !head;
                continue;
            }

            if(c == 'D') {
                if(list.isEmpty() || list.peek() == 0) {
                    return "error";
                }

                if(head) {
                    list.pollFirst();
                } else {
                    list.pollLast();
                }
            }
        }

        StringBuilder sb = new StringBuilder("[");
        while(!list.isEmpty()) {
            if(head) {
                sb.append(list.pollFirst());
            } else {
                sb.append(list.pollLast());
            }
            if(list.size() != 0) sb.append(",");
        }
        sb.append("]");

        return sb.toString();
    }

    static Deque<Integer> makeQueue(String arr) {
        arr = arr.substring(1, arr.length() - 1);
        StringTokenizer st = new StringTokenizer(arr, ",");

        Deque<Integer> list = new LinkedList<>();
        while(st.hasMoreTokens()) {
            list.offerLast(Integer.parseInt(st.nextToken()));
        }

        return list;
    }
}
