package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bomi on 2019-07-07.
 */
public class Main_3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        System.out.println(Integer.parseInt(str[1]) * 2 - Integer.parseInt(str[0]));
    }
}
