package primeNumber;

import java.util.*;

public class Main_2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=m; i<=n; i++) {
			boolean flag = true;
			
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					flag = false;
					break;
				}
			}
			if(i != 1 && flag) {
				sum += i;
				list.add(i);
			}
		}

		if(list.size() != 0) {
			System.out.println(sum);
			System.out.println(list.get(0));
		} else System.out.println(-1);

	}

}
