package me.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        LinkedList<Character> list = new LinkedList<>();

        for(char c : str.toCharArray()) {
            list.add(c);
        }

        int n = Integer.parseInt(br.readLine());
        String s = "";
        int point = list.size();
        for(int i=0; i<n; i++) {
            s = br.readLine();
            if("L".equals(s)) {
                if(point > 0) point--;
                continue;
            }
            if("D".equals(s)) {
                if(point < list.size()) point++;
                continue;
            }
            if("B".equals(s)) {
                if(point > 0) list.remove(--point);
                continue;
            }
            String addStr = s.split(" ")[1];
            if(point == list.size()) {
                list.addLast(addStr.charAt(0));
                point++;
                continue;
            }
            list.add(point, addStr.charAt(0));
        }

        for(char ch : list) {
            System.out.print(ch);
        }

    }
}
