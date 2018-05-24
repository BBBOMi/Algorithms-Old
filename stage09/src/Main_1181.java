import java.util.*;

public class Main_1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> set = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			String word = sc.next();
			set.add(word);
		}
		
		List list = new ArrayList(set);
		
		Collections.sort(list, new Comparator<String>() {
			public int compare(String w1, String w2) {
				if(w1.length() == w2.length())
					return w1.compareTo(w2);
				return w1.length() - w2.length();
			}
		});
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
	}

}
