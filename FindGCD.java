package com.abdus.algo;

//https://www.freecodecamp.org/news/euclidian-gcd-algorithm-greatest-common-divisor/
public class FindGCD {
	
	public static void main(String[] args) {
		
		int[] arr = {0,0};
		
		int gcd = findGCDOfArray(arr);
		
		System.out.println(gcd);
	}
	
	
	public static int findGCDOfArray(int[] arr) {
		
		int result = 0;
		for (int i : arr) {
			result = gcd(result ,i);
			
			if(result == 1)
				return result;	
			
		}
		return result;
		
	}
	
	public static int gcd(int a ,int b) {
		
		if(b==0) {
			return a;
		}
			
		
		return gcd(b,a%b);
		
		
	}

}
