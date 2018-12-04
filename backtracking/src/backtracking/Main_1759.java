package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1759 {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int l = Integer.parseInt(str[0]);
        int c = Integer.parseInt(str[1]);

        List<Character> list = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<c; i++) {
            list.add(st.nextToken().charAt(0));
        }

        Collections.sort(list);

        boolean[] check = new boolean[26];
        StringBuffer sb = new StringBuffer(l);
        solution(list, sb, check);
    }

    static void solution(List<Character> list, StringBuffer sb, boolean[] check) {
        if(sb.length() == sb.capacity()) {
            if(count != 0)
                System.out.println(sb.toString());
       } else {
            int n = sb.length() == 0 ? 0 : list.indexOf(sb.charAt(sb.length() - 1));

            for(int i = n; i < list.size(); i++) {
               char ch = list.get(i);

               if(!check[ch - 97]) {
                   check[ch - 97] = true;
                   sb.append(ch);
                   if(ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117) {
                       count++;
                   }
                   solution(list, sb, check);
               }
           }
       }

       if(sb.length() != 0) {
           char ch = sb.charAt(sb.length() - 1);
           check[ch - 97] = false;
           if(ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117) {
               count--;
           }
           sb.deleteCharAt(sb.length() - 1);
       }
    }
}
