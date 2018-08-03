package binomialCoefficient;

import java.math.BigInteger;
import java.util.*;

public class Main_2407 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(combination(n, m));

	}
	
	static BigInteger combination(int n, int m) {
		if(!(5<=m && m<=n && n<=100))
			return BigInteger.valueOf(-1);
		
		int high = (n-m)>m ? n-m : m;
		int low = high == m ? n-m : m;
	
		BigInteger result = BigInteger.ONE;
		for(int i=n; i>high; i--) {
			/*result *= i;
			System.out.print(i + " : " + result + "     ");
			
			result /= low--;
			
			System.out.println(low + " : " + result);*/
			BigInteger mul = BigInteger.valueOf(i);
			BigInteger div = BigInteger.valueOf(low--);
			
			//System.out.print(result + "    ");
			result = result.multiply(mul);
			
			//System.out.println(result);
			result = result.divide(div);
			
			//System.out.println(result);
			
		}
		
		return result;
	}

}
