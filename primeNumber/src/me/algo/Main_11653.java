package me.algo;

import java.io.*;

public class Main_11653 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

       for(int i=2; i<=n; i++) {
           while(n%i == 0) {
               n /= i;
               bw.write(i + "\n");
           }
       }

        bw.close();
        br.close();
    }
}
