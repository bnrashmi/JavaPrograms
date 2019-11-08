package com.java.programs;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {

		int n =9;
		System.out.println(isHappy(n));
	}

	public static boolean isHappy(int n) {

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(n);
		while(n !=1) {
			
			int val = n,sum =0;
			while(val !=0) {
				int rem = val%10;
				sum+= rem *rem;
				val = val /10;
			}
			
			if(set.contains(sum)) {
				return false;
			}
			set.add(sum);
			n = sum;
		}
		return true;
	}
	
}
