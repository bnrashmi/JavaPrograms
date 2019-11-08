package com.java.programs;

public class LongestCommonPrifix {

	
	public static void main(String[] args) {
		
		String [] strs = {"flower","flow","flight"};
		
		System.out.println(longestCommonPrefix(strs));
	}
	
	 public static String longestCommonPrefix(String[] strs) {
	        
		 int stringLen = strs.length;
		 
		 if(stringLen >=2) {
			 
			 String common = "";
			 int i=0,j=0;
			 while(i < strs[0].length() && j < strs[1].length()) {
				 if(strs[0].charAt(i) == strs[1].charAt(j)) {
					 common = common + strs[0].charAt(i);
					 i++;
					 j++;
				 }else {
					 break;
				 }
			 }
			 
			 //System.out.println(common);
			 
			 for(int k=2;k < stringLen;k++) {
				 int m=0,n=0; String str = common;
				 common = "";
				 while(m < str.length() && n < strs[k].length()) {
					 if(str.charAt(m) == strs[k].charAt(n)) {
						 common = common + strs[0].charAt(m);
						 m++;
						 n++;
					 }else {
						 break;
					 }
				 }
				
			 }
			 return common;
		 }else if(stringLen == 1){
             return strs[0];
         }
		 return "";
	}
}
