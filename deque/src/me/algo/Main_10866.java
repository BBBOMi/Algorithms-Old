package me.algo;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main_10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0; i<n; i++) {
            String[] str = br.readLine().split(" ");
            switch(str[0]) {
                case "push_front" :
                    dq.offerFirst(Integer.parseInt(str[1]));
                    break;
                case "push_back" :
                    dq.offerLast(Integer.parseInt(str[1]));
                    break;
                case "pop_front" :
                    bw.write(dq.isEmpty() ? "-1\n" :  dq.pollFirst() + "\n");
                    break;
                case "pop_back" :
                    bw.write(dq.isEmpty() ? "-1\n" : dq.pollLast() + "\n");
                    break;
                case "size" :
                    bw.write(dq.size() + "\n");
                    break;
                case "empty" :
                    bw.write(dq.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front" :
                    bw.write(dq.isEmpty() ? "-1\n" : dq.peekFirst() + "\n");
                    break;
                case "back" :
                    bw.write(dq.isEmpty() ? "-1\n" : dq.peekLast() + "\n");
                    break;
            }
        }
        bw.close();
    }
}
