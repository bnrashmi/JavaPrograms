package com.java.programs;

public class ReverseString {

	public static void main(String[] args) {
		String str = "rashmi";
	
		for(int i=str.length();i>0;i--) {
			System.out.print(str.charAt(i-1));
		}
		
	}
}
