package com.java.programs; 

public class lengthOfLastWord {

	
	public static void main(String[] args) {
		String s = "Hello World";
		
		System.out.println(lengthOfLastWordString(s));
	}
	
	 public static int lengthOfLastWordString(String s) {
	     
		 String str [] = s.split(" ");
		 
		 if(str.length>1) {
			 return str[str.length-1].length();
		 }
		 return 0;
	 }
}
