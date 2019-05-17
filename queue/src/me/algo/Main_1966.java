package me.algo;

import java.util.*;

public class Main_1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(!(n<=100 || (0<=m && m<n))) return;

			int[] priority = new int[n];
			for(int j=0; j<priority.length; j++) {
				priority[j] = sc.nextInt();
			}
			//System.out.println(Arrays.toString(priority));
			printerQueue(m, priority);
		}

	}

	public static void printerQueue(int ind, int[] priority) {
		int max = 0; int maxInd = 0;
		int[] tmp = new int[priority.length];
		boolean[] check = new boolean[priority.length];
		check[ind] = true;
		
		for(int i=0; i<priority.length; i++) {
			//System.out.println("priority[i] : " + priority[i]);
			if(max < priority[i]) {
				max = priority[i];
				maxInd = i;
			}
		}

		for(int i=0; i<priority.length-maxInd; i++) {
			tmp[i] = priority[maxInd + i];
		}
		
		for(int i=priority.length-maxInd; i<tmp.length; i++) {
			tmp[i] = priority[i-(priority.length-maxInd)];
		}


		
		/*for(int i=0; i<priority.length; i++) {
			for(int j=i; j<priority.length; j++) {
				if(max < priority[i]) {
					max = priority[i];
					maxInd = i;
				}
			}

			for(int j=0; j<priority.length-maxInd; j++) {
				tmp[j] = priority[maxInd++];
			}

			for(int j=priority.length-maxInd; j<priority.length; j++) {
				//tmp[j] = priority[];
			}

		}*/


	}

}
