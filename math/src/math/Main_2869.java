package math;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-07-15.
 */
public class Main_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int days = (v - b - 1) / (a - b) + 1;

        bw.write(days + "\n");
        bw.close();
        br.close();
    }
}
