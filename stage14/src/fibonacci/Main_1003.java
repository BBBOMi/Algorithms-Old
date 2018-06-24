package fibonacci;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1003 {
	static int countZero;
	static int countOne;

	public static void main(String[] args) {
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw); 

			int t = Integer.parseInt(br.readLine().trim());

			for(int i=0; i<t; i++) {
				int n = Integer.parseInt(br.readLine().trim());
				if(n < 0 || 40 < n) return;

				
				fibonacci(n);
				
				bw.write(countZero + " " + countOne + "\r\n");
				countZero = 0;
				countOne = 0;
			}
			
			
		} catch(IOException e) {
			
		} finally {
			if(br != null)
				try { br.close(); } catch(IOException e) { }
			if(bw != null)
				try { bw.close(); } catch(IOException e) { }
		}
	}

	static int fibonacci(int n) {
		if(n == 0) {
			countZero++;
			return 0;
		} else if(n == 1) {
			countOne++;
			return 1;
		} else
			return fibonacci(n-1) + fibonacci(n-2);
	}

}
