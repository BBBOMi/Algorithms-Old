package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-07-07.
 */
public class Main_1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0, min = Integer.MAX_VALUE;
        int i = (int)Math.ceil(Math.sqrt(m));
        for(; i*i<=n; i++) {
            sum += i*i;
            if(min > i*i) min = i*i;
        }

        System.out.println(sum != 0 ? sum + "\n" + min : -1);
    }
}
