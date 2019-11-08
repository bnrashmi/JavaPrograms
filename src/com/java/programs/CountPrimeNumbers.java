package com.java.programs;

public class CountPrimeNumbers {

	public static void main(String[] args) {

		int n = 2;
		System.out.println(countPrimes(n));
	}

	public static int countPrimes(int n) {
		int count = 0;
		if(n==0 ||n==1) {
			return count;
		}
		if(n > 0) {
		
		for(int i=2;i<n;i++) {
			int num =0;
			for(int j=2;j<=i/2;j++) {
				
				if(i%j==0) {
					num++;
					break;
				}
				
			}
			if(num == 0) {
				count++;
			}
		}
		}
		
		return count;
	}
}
