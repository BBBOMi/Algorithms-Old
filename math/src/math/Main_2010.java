package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-07-07.
 */
public class Main_2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i=0, num; i<n; i++) {
            num = Integer.parseInt(br.readLine());
            sum += (num-1);
        }

        System.out.println(++sum);
    }
}
