package com.java.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		
		String s = "{"; 
				//"(]";
				//"()";
				
				//"()[]{}";
		
		System.out.println(isValid(s));
	}
	
	 public static boolean isValid(String s) {
	        
		 if(s.length() == 0) {
			 return true;
		 }else if(s.length() ==1) {
			 return false;
		 }
		 
		 Map<Character, Character> map =new HashMap<Character, Character>();
		 
		 map.put('(', ')');
		 map.put('{', '}');
		 map.put('[', ']');
		 boolean flag = true;
		 Stack<Character> stack = new Stack<Character>();
		 
		 for(int i=0;i<s.length()-1;i++) {
			 
			if(map.containsKey(s.charAt(i))) {
			 if(map.get(s.charAt(i)) != s.charAt(i+1) ) {
				flag = false;
			 }
			 i++;
			}else {
				flag = false;
			}
		 }
		 return flag;
	}
}
