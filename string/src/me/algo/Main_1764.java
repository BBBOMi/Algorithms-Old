package me.algo;

import java.io.*;
import java.util.*;

/**
 * Created by bomi on 2019-06-05.
 */
public class Main_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");

        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);

        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();
        for(int i=0; i<n; i++) {
            set.add(br.readLine());
        }

        String str;
        for(int i=0; i<m; i++) {
            str = br.readLine();
            if(set.contains(str)) {
                list.add(str);
            }
        }

        Collections.sort(list);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(list.size() + "\n");
        for(String s : list) {
            bw.write(s + "\n");
        }

        bw.close();
    }
}
