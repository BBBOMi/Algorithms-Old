package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1759 {

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
           System.out.println(sb.toString());
       } else {
            int n = sb.length() == 0 ? 0 : list.indexOf(sb.charAt(sb.length() - 1));

            for(int i = n; i < list.size(); i++) {
               char ch = list.get(i);

               if(!check[ch - 96]) {
                   check[ch - 96] = true;
                   sb.append(ch);
                   solution(list, sb, check);
               }
           }
       }

       if(sb.length() != 0) {
           check[sb.charAt(sb.length() - 1) - 96] = false;
           sb.deleteCharAt(sb.length() - 1);
       }
    }
}
