package me.algo;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-08-28.
 */
public class Main_2263 {
    private static int[] inOrder;
    private static int[] postOrder;

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());

       inOrder = new int[n+1];
       StringTokenizer st = new StringTokenizer(br.readLine());
       for(int i=1, value; i<=n; i++) {
           value = Integer.parseInt(st.nextToken());
           inOrder[value] = i;
       }

       postOrder = new int[n];
       st = new StringTokenizer(br.readLine());
       for(int i=0; i<n; i++) {
           postOrder[i] = Integer.parseInt(st.nextToken());
       }

       preOrderPrint(0, n-1);
    }

    private static void preOrderPrint(int start, int end) {
        if(start > end) return;
        int rootValue = postOrder[end];
        System.out.println(rootValue + " ");
        if(start == end) return;

        int index = start;
        while(index < end) {
            int value = postOrder[index];
            if(inOrder[value] > inOrder[rootValue]) break;
            index++;
        }

        preOrderPrint(start, index-1);
        preOrderPrint(index, end-1);

    }
}
