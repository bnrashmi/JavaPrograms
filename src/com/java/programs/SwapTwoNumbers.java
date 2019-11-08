package com.java.programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		System.out.println("Swap 2 numbers ");
		int i=10, j=20;
		int temp;
		temp = j;
		j= i;
		i= temp;
		
		System.out.println("i=="+i+ "   J=="+ j);
	}
}
