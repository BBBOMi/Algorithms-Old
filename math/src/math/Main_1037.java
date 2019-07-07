package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by bomi on 2019-07-07.
 */
public class Main_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = 0, min = Integer.MAX_VALUE;
        for(int i=0, number; i<n; i++) {
            number = Integer.parseInt(st.nextToken());
            if(min > number) min = number;
            if(max < number) max = number;
        }

        System.out.println(min * max);
    }
}
