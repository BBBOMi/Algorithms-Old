package simulation;

import java.util.*;

public class Main_1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> bars = new ArrayList<>();
		int sum;

		int x = sc.nextInt();
		bars.add(64);

		while(true) {
			sum = 0;
			for(int i=0; i<bars.size(); i++) {
				sum += bars.get(i);
			}

			if(sum > x) {
				int lastBar = bars.remove(bars.size()-1);
				int newBar = lastBar/2;
				sum -= lastBar;

				if(sum+newBar >= x) {
					bars.add(newBar);
					sum += newBar;
				} else {
					bars.add(newBar);
					bars.add(newBar);
					sum += lastBar;
				}
			}

			if(x == sum) {
				break;
			}
		}
		System.out.println(bars.size());

	}

}