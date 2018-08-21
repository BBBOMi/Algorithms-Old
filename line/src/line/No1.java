package line;

import java.util.*;

public class No1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			String str = sc.next();
			Map<Character, Integer> map = new LinkedHashMap<>();
			for(int j=0; j<str.length(); j++) {
				char ch = str.charAt(j);
				if(map.containsKey(ch)) {
					map.put(ch, (map.get(ch) + 1));
				} else {
					map.put(ch, 1);
				}
			}
			Set<Character> keys = map.keySet();
			Iterator<Character> it = keys.iterator();
			while(it.hasNext()) {
				char key = it.next();
				int value = map.get(key);
				System.out.print(""+value+key);
			}
		}
	}

}
