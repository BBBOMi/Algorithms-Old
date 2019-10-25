package math;

import java.io.*;
import java.util.*;

/**
 * Created by bomi on 2019-10-25.
 */
public class Main_15953 {
    // [인원][상금]
    private static int[][] fest1 = {{1, 500}, {3, 300}, {6, 200}, {10, 50}, {15, 30}, {21, 10}};
    private static int[][] fest2 = {{1, 512}, {3, 256}, {7, 128}, {15, 64}, {31, 32}};

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        StringBuilder result = calculateCost(t);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result.toString());

        bw.close();
        br.close();
    }

    private static StringBuilder calculateCost(int t) throws IOException {
        StringBuilder sb = new StringBuilder();
        for(int i=0, a, b, total; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            total = findCost(a, fest1) + findCost(b, fest2);
            sb.append(total*10000).append("\n");
        }
        return sb;
    }

    private static int findCost(int grade, int[][] festival) {
        for(int i=0, length=festival.length; i<length; i++) {
            if(grade <= festival[i][0]) {
                return festival[i][1];
            }
        }
        return 0;
    }
}
